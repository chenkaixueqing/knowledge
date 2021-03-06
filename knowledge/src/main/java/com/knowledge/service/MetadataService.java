package com.knowledge.service;

import java.util.List;

import com.knowledge.body.ElementDataReq;
import com.knowledge.body.MetadataFieldReq;
import com.knowledge.body.vo.MetadataFieldVo;
import com.knowledge.body.vo.MetadataVo;
import com.knowledge.domain.Response;

public abstract interface MetadataService {
	
	/**
	 * 查询元数据
	 * 
	 * @param category 类别
	 * @param name 模糊查询
	 * @return
	 */
	List<MetadataVo> queryMetadata(String category, String name);
	
	/**
	 * 查询类别
	 * 
	 * @return
	 */
	List<MetadataVo> queryCategory();
	
	/**
	 * 添加元数据信息
	 * 
	 */
	Response saveMetadata(ElementDataReq request);
	
	/**
	 * 查询元数据组
	 * 
	 * @param category 类别
	 * @param name 模糊查询
	 * @return
	 */
	List<MetadataFieldVo> queryMetadataField(ElementDataReq req);

	
	/**
	 * 添加元数据组信息
	 * 
	 */
	Response saveMetadataField(MetadataFieldReq request);
	
}
