package com.retailBanking.accountsService.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;



@Entity
@Table(name="accounts")
public class Account {
	
	@Id
	@Column(name="accountno")
	private double accountNo;
	
	@Column(name="accountnickname")
	private String accountNickname;
	
	@JsonBackReference
	@NotNull
	@ManyToOne
	@JoinColumn(name="userid")
	private Login userId;
	
	@Column(name="accounttype")
	private String accountType;
	
	@Column(name="accountbalance")
	private double accountBalance;
	
	
	
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(targetEntity=CreditCard.class,mappedBy="accountNo",fetch=FetchType.LAZY)
	private List<CreditCard> cards=new ArrayList<>();
	

	public Account() {
		super();
	}

	public Account(double accountNo, Login userId, String accountType, double accountBalance, String accountNickname,
			List<CreditCard> cards) {
		super();
		this.accountNo = accountNo;
		this.userId = userId;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
		this.accountNickname = accountNickname;
		this.cards = cards;
		
	}

	public double getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(double accountNo) {
		this.accountNo = accountNo;
	}

	public Login getUserId() {
		return userId;
	}

	public void setUserId(Login userId) {
		this.userId = userId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountNickname() {
		return accountNickname;
	}

	public void setAccountNickname(String accountNickname) {
		this.accountNickname = accountNickname;
	}

	public List<CreditCard> getCards() {
		return cards;
	}

	public void setCards(List<CreditCard> cards) {
		this.cards = cards;
	}

	
	
	
	
	
}