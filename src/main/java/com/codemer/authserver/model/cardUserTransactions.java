package com.codemer.authserver.model;


import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

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
@Table(name= "CARDHOLDER_TRANSACTIONS_TBL")
public class cardUserTransactions {
	
	@Id
	private int id;
	private long cardNumber;
	private String description;
	@DateTimeFormat(pattern = "dd/MM/yyyy h:mm a")
	private Date transactionTime;
	@DateTimeFormat(pattern = "dd/MM/yyyy h:mm a")
	private Date transactionPostedTime;
	
	private String amount;
	
	private String balance;

	public cardUserTransactions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public cardUserTransactions(int id, long cardNumber, String description, Date transactionTime,
			Date transactionPostedTime, String amount, String balance) {
		super();
		this.id = id;
		this.cardNumber = cardNumber;
		this.description = description;
		this.transactionTime = transactionTime;
		this.transactionPostedTime = transactionPostedTime;
		this.amount = amount;
		this.balance = balance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(Date transactionTime) {
		this.transactionTime = transactionTime;
	}

	public Date getTransactionPostedTime() {
		return transactionPostedTime;
	}

	public void setTransactionPostedTime(Date transactionPostedTime) {
		this.transactionPostedTime = transactionPostedTime;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "cardUserTransactions [id=" + id + ", cardNumber=" + cardNumber + ", description=" + description
				+ ", transactionTime=" + transactionTime + ", transactionPostedTime=" + transactionPostedTime
				+ ", amount=" + amount + ", balance=" + balance + "]";
	}
	
	
	
	
	
	

}
