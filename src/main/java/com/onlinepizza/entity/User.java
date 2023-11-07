package com.onlinepizza.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	
	private String userName;
	private String password;
	private Long contactNo;
	private String email;
	private String city;
	//Admin, Customer
	private String userRole;
	
	
public User() {}


public User(String userName, String password, Long contactNo, String email, String city, String userRole) {
	super();
	this.userName = userName;
	this.password = password;
	this.contactNo = contactNo;
	this.email = email;
	this.city = city;
	this.userRole = userRole;
}


public String getUserName() {
	return userName;
}


public void setUserName(String userName) {
	this.userName = userName;
}


public String getPassword() {
	return password;
}


public void setPassword(String password) {
	this.password = password;
}


public Long getContactNo() {
	return contactNo;
}


public void setContactNo(Long contactNo) {
	this.contactNo = contactNo;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}


public String getUserRole() {
	return userRole;
}


public void setUserRole(String userRole) {
	this.userRole = userRole;
}


@Override
public String toString() {
	return "User [userName=" + userName + ", password=" + password + ", contactNo=" + contactNo + ", email=" + email
			+ ", city=" + city + ", userRole=" + userRole + "]";
}







}
