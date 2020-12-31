package com.transaction.retail.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="accounts")
public class Account {
	
	
		
		@Id
		@Column(name="accountno")
		private double accountNo;
		
		@Column(name="accountnickname")
		private String accountNickname;
		
		
		@Column(name="accounttype")
		private String accountType;
		
		@Column(name="accountbalance")
		private double accountBalance;
		
		
		@JsonManagedReference
		@JsonIgnore
		@OneToMany(targetEntity=Transaction.class,mappedBy="accountNo",fetch=FetchType.LAZY)
		private List<Transaction> transaction = new ArrayList<>();


		public Account() {
			super();
			// TODO Auto-generated constructor stub
		}


		public Account(double accountNo, String accountNickname, String accountType, double accountBalance,
				List<Transaction> transaction) {
			super();
			this.accountNo = accountNo;
			this.accountNickname = accountNickname;
			this.accountType = accountType;
			this.accountBalance = accountBalance;
			this.transaction = transaction;
		}


		public double getAccountNo() {
			return accountNo;
		}


		public void setAccountNo(double accountNo) {
			this.accountNo = accountNo;
		}


		public String getAccountNickname() {
			return accountNickname;
		}


		public void setAccountNickname(String accountNickname) {
			this.accountNickname = accountNickname;
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


		public List<Transaction> getTransaction() {
			return transaction;
		}


		public void setTransaction(List<Transaction> transaction) {
			this.transaction = transaction;
		}


		

		

}
