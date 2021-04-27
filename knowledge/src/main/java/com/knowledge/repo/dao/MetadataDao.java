package com.knowledge.repo.dao;

import java.util.List;

import com.knowledge.body.vo.MetadataVo;

public  interface MetadataDao {

	/**
	 * 查询元数据
	 * 
	 * @param category 类别
	 * @param name 模糊查询
	 * @return
	 */
	List<MetadataVo> getMetadata(String category, String name);

}
