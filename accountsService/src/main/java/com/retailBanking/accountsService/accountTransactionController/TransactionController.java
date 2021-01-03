package com.retailBanking.accountsService.accountTransactionController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.retailBanking.accountsService.model.Transaction;
import com.retailBanking.accountsService.repository.TransactionServiceProxy;



@RestController
public class TransactionController {
	
	@Autowired
	private TransactionServiceProxy ser;
	
	
	
	
	@GetMapping("account/{accno}")
	public List<Transaction> getTransactionByAccount(@PathVariable("accno") long no){
		List<Transaction> tr = ser.getTransactionByAccount(no);
		System.out.println("output"+tr);
		return tr;
	}

}
