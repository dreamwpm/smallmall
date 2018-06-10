package org.smallmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.smallmall.entity.SysMacroEntity;

/**
 * 通用字典表Dao
 *
 * @author alan
 * @date 2017-08-22 11:48:16
 */
public interface SysMacroDao extends BaseDao<SysMacroEntity> {

	/**
	 * 查询数据字段
	 * 
	 * @param value
	 * @return
	 */
	List<SysMacroEntity> queryMacrosByValue(@Param("value") String value);
}
