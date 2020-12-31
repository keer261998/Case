package com.retailBanking.accountsService.model;

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
@Table(name="creditcard")
public class CreditCard {

	@Id
	@Column(name="creditcardnumber")
	private double creditCardNumber;
	
	@Column(name="creditbalance")
	private double creditBalance; 
	
	@Column(name="availablebalance")
	private double availableBalance;
	
	@Column(name="paymentduedate")
	private LocalDate paymentDueDate;
	
	@Column(name="minimumpayment")
	private double minimumPayment;
	
	@JsonBackReference
	@NotNull
	@ManyToOne
	@JoinColumn(name="accountNo")
	private Account accountNo;

	public CreditCard() {
		super();
	}

	public CreditCard(double creditCardNumber, double creditBalance, double availableBalance, LocalDate paymentDueDate,
			double minimumPayment, Account accountNo) {
		super();
		this.creditCardNumber = creditCardNumber;
		this.creditBalance = creditBalance;
		this.availableBalance = availableBalance;
		this.paymentDueDate = paymentDueDate;
		this.minimumPayment = minimumPayment;
		this.accountNo = accountNo;
	}

	public double getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(double creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public double getCreditBalance() {
		return creditBalance;
	}

	public void setCreditBalance(double creditBalance) {
		this.creditBalance = creditBalance;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public LocalDate getPaymentDueDate() {
		return paymentDueDate;
	}

	public void setPaymentDueDate(LocalDate paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public double getMinimumPayment() {
		return minimumPayment;
	}

	public void setMinimumPayment(double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}

	public Account getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Account accountNo) {
		this.accountNo = accountNo;
	}
	
}