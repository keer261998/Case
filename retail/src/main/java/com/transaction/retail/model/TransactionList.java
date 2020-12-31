package com.transaction.retail.model;

import java.util.List;

public class TransactionList {

	private List<Transaction> transaction;

	public List<Transaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(List<Transaction> transaction) {
		this.transaction = transaction;
	}

	@Override
	public String toString() {
		return "TransactionList [transaction=" + transaction + "]";
	}
	
	
}
