package com.codemer.authserver.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "CARDHOLDER_DETAILS_TBL")
public class cardHolderDetails {
	@Id
	private int id;
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	private String availableBalance;
	private String postedBalance;
	public cardHolderDetails(int id, String userName, String email, String firstName, String lastName,
			String availableBalance, String postedBalance) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.availableBalance = availableBalance;
		this.postedBalance = postedBalance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(String availableBalance) {
		this.availableBalance = availableBalance;
	}
	public String getPostedBalance() {
		return postedBalance;
	}
	public void setPostedBalance(String postedBalance) {
		this.postedBalance = postedBalance;
	}
	public cardHolderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "cardHolderDetails [id=" + id + ", userName=" + userName + ", email=" + email + ", firstName="
				+ firstName + ", lastName=" + lastName + ", availableBalance=" + availableBalance + ", postedBalance="
				+ postedBalance + "]";
	}
	
	
	


}
