package com.retailBanking.accountsService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.Transaction;

@Service
public interface TransactionService {
	
	 public List<Transaction> getTransaction(long accno);


}
