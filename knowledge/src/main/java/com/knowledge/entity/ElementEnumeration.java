package com.knowledge.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ELEMENT_ENUMERATION") // 元数据--枚举值表
public class ElementEnumeration {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// 元数据ID
	@Column(name = "ELEMENT_ID")
	private Long elementId;;

	// 枚举值code
	@Column(name = "CODE")
	private String code;

	// 枚举值value
	@Column(name = "VALUE")
	private String value;

	// 创建人
	@Column(name = "CREATE_BY")
	private String createBy;

	// 创建时间
	@Column(name = "CREATED_TIME")
	private Date createdTime;

	// 创建人
	@Column(name = "UPDATE_BY")
	private String updateBy;

	// 创建时间
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

	public Long getElementId() {
		return elementId;
	}

	public void setElementId(Long elementId) {
		this.elementId = elementId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

}
