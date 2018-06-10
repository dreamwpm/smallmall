package org.smallmall.utils;

import java.io.UnsupportedEncodingException;

/**
 * base64转换类<br>
 * 描述: Base64 <br>
 */
public class Base64 {
	// 加密
	public static String encode(String str) {
		byte[] b = null;
		String s = null;
		try {
			b = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (b != null) {
			s = new org.apache.commons.codec.binary.Base64().encodeBase64String(b);
			// s = new BASE64Encoder().encode(b);
		}
		return s;
	}

	// 解密
	public static String decode(String s) {
		byte[] b = null;
		String result = null;
		if (s != null) {
			// BASE64Decoder decoder = new BASE64Decoder();
			try {
				// b = decoder.decodeBuffer(s);
				b = new org.apache.commons.codec.binary.Base64().decodeBase64(s);
				result = new String(b, "utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String a = Base64.encode("eesf斯蒂芬但是防守对方");
		System.out.println(a);
		String b = Base64.decode(a);
		System.out.println(b);
	}
}