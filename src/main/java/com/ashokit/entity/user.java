package com.ashokit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="USERS_DETAILS")
public class user {
	@Id
	@Column(name="user_Id")
	private Integer userid;
	@Column(name="user_name")
	private String username;
	@Column(name="user_phno")
	private Long userphno;
	@Column(name="user_age")
	private Integer userage;
	@Column(name="user_country")
	private String country;

	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUserphno() {
		return userphno;
	}
	public void setUserphno(long userphno) {
		this.userphno = userphno;
	}
	public Integer getUserage() {
		return userage;
	}
	public void setUserage(Integer userage) {
		this.userage = userage;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "user [userid=" + userid + ", username=" + username + ", userphno=" + userphno + ", userage=" + userage
				+ ", country=" + country + "]";
	}
	
}
