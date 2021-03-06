package com.knowledge.body.vo;

public class TemplateElementVo {
	
	//元素类型 1:元数据 2:元数据组
	private String type;
	//元数据名称
	private String fieldName;
	//元数据ID
	private Long elementId;
	//是否必录 空/0：否 1：是
	private String isNotNull;
	//是否可添加 空/0：否 1：是
	private String isCanAdd;
	//排序
	private String sort;
	//输入类型：1.单行文本、2.单选下拉框、3.多选下拉框、4.时间组件、5.文本编辑器、6.附件
	private String inputType;

	//元数据名称代码
	private String fieldCode;
	public String getFieldCode() {
		return fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public Long getElementId() {
		return elementId;
	}
	public void setElementId(Long elementId) {
		this.elementId = elementId;
	}
	public String getIsNotNull() {
		return isNotNull;
	}
	public void setIsNotNull(String isNotNull) {
		this.isNotNull = isNotNull;
	}
	public String getIsCanAdd() {
		return isCanAdd;
	}
	public void setIsCanAdd(String isCanAdd) {
		this.isCanAdd = isCanAdd;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInputType() {
		return inputType;
	}
	public void setInputType(String inputType) {
		this.inputType = inputType;
	}
	
}
