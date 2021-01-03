package com.transaction.retail.model;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.sun.istack.NotNull;

@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@Column(name = "transactionId")
	private double transactionId;
	
	
	
	private double amount;

	
	private LocalDate date;
	
	
	private long accountNo;


	public Transaction() {
		
	}


	public Transaction(double transactionId, double amount, LocalDate date, long accountNo) {
		super();
		this.transactionId = transactionId;
		this.amount = amount;
		this.date = date;
		this.accountNo = accountNo;
	}


	public double getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(double transactionId) {
		this.transactionId = transactionId;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public long getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}


	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", amount=" + amount + ", date=" + date + ", accountNo="
				+ accountNo + "]";
	}
	
	

	
    
	
	

}