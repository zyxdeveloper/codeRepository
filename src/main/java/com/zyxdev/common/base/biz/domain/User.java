//package com.zyxdev.common.base.biz.domain;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name="user")
//public class User implements Serializable {
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	private Long id;
//	@Id
//	@Column(name="id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	public Long getId() {
//		return id;
//	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((id == null) ? 0 : id.hashCode());
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
//		return result;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (id == null) {
//			if (other.id != null)
//				return false;
//		} else if (!id.equals(other.id))
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		if (userName == null) {
//			if (other.userName != null)
//				return false;
//		} else if (!userName.equals(other.userName))
//			return false;
//		return true;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	@Column(name="name")
//	public String getName() {
//		return name;
//	}
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	@Column(name="user_name")
//	public String getUserName() {
//		return userName;
//	}
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//	@Column(name="password")
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	private String name;
//	
//	private String userName;
//	
//	private String password;
//	
//
//}
