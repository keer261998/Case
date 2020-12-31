package com.retailBanking.accountsService.accountTransactionController;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.Transaction;

public interface AccountTransaction {
	
	List<Transaction> getTransactionByAccount(@PathVariable("accno") long no);
}
