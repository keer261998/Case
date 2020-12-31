package com.transaction.retail.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.transaction.retail.model.Account;
import com.transaction.retail.model.Transaction;
import com.transaction.retail.model.TransactionList;
import com.transaction.retail.service.TransactionService;


@RestController
public class TransactionController {

	
	@Autowired
	private TransactionService ser;
	
	
	@GetMapping("account/transaction")
	public List<Transaction> getAllTransaction(){
		return ser.fetchAllTransaction();
	}
	
	@GetMapping(value="account/{accountNo}",produces = { MediaType.APPLICATION_JSON_VALUE})
	public TransactionList getTransactionByAccount(@PathVariable("accountNo") double no){
		System.out.println("Entered");
		TransactionList transaction = new TransactionList();
		List<Transaction> tr = ser.fetchTransactionByAccount(no);
		transaction.setTransaction(tr);
		System.out.println("output in transactionservcie:"+transaction.getTransaction());
		return transaction;
	}
}
