package com.retailBanking.accountsService.accountTransactionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.model.Account;
import com.retailBanking.accountsService.model.Transaction;
import com.retailBanking.accountsService.service.TransactionService;


@RestController
public class TransactionController implements AccountTransaction {
	
	@Autowired
	private TransactionService ser;
	
	
	
	
	@GetMapping("account/{accno}")
	public List<Transaction> getTransactionByAccount(@PathVariable("accno") long no){
		List<Transaction> tr = ser.getTransaction(no);
		System.out.println("output"+tr);
		return tr;
	}

}
