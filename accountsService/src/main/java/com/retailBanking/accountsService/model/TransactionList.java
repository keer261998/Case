package com.retailBanking.accountsService.model;

import java.util.List;

public class TransactionList {
	
	private List<Transaction> transactions;

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public String toString() {
		return "TransactionList [transactions=" + transactions + "]";
	}
	
	

}
