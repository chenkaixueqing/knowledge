package com.knowledge.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELEMENT_DATA") // 元数据表
public class ElementData {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 类别
	@Column(name = "CATEGORY")
	private String category;
	
	// 类别名称
	@Column(name = "CATEGORY_NAME")
	private String categoryName;

	// 主题域名称
	@Column(name = "SUBJECT_NAME")
	private String subjectName;

	// 字段中文名
	@Column(name = "NAME")
	private String name;

	// 字段名称
	@Column(name = "FIELD_NAME")
	private String fieldName;

	// 数据类型
	@Column(name = "DATA_TYPE")
	private String dataType;

	// 输入类型：1.单行文本、2.单选下拉框、3.多选下拉框、4.时间组件、5.文本编辑器、6.附件
	@Column(name = "INPUT_TYPE")
	private String inputType;
	
	//级别：1.一级 2.二级 3.三级 4.四级
	@Column(name = "LEVEL")
	private String level;

	// 创建人
	@Column(name = "CREATE_BY")
	private String createBy;

	// 创建时间
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	// 更新人
	@Column(name = "UPDATE_BY")
	private String updateBy;

	// 更新时间
	@Column(name = "UPDATE_TIME")
	private Date updateTime;

	// 是否删除：空/0：否 1：是
	@Column(name = "IS_DELETE")
	private String isDelete;

	public String getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getInputType() {
		return inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
