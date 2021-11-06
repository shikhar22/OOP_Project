package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	public String username;
	public String idNumber;
	public String email;
	public String mobileNumber;
	public String hostelName;
	public String roomNumber;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", idNumber=" + idNumber + ", email=" + email + ", mobileNumber="
				+ mobileNumber + ", hostelName=" + hostelName + ", roomNumber=" + roomNumber + "]";
	}
	
	
	

}
