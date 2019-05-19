package com.zyxdev.common.base.biz.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "las_ctrct")
public class Ctrct implements Serializable {

	private String id;
	private String name;
	private String applUserId;
	private String applUserName;
	private String code;
	private String orgId;
	private String orgName;

	@Override
	public String toString() {
		return "Ctrct [id=" + id + ", name=" + name + ", applUserId=" + applUserId + ", applUserName=" + applUserName
				+ ", code=" + code + ", orgId=" + orgId + ", orgName=" + orgName + "]";
	}

	@Column(name = "id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "appl_user_id")
	public String getApplUserId() {
		return applUserId;
	}

	public void setApplUserId(String applUserId) {
		this.applUserId = applUserId;
	}

	@Column(name = "appl_user_name")
	public String getApplUserName() {
		return applUserName;
	}

	public void setApplUserName(String applUserName) {
		this.applUserName = applUserName;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "org_id")
	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	@Column(name = "org_name")
	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
}
