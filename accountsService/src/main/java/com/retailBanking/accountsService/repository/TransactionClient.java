package com.retailBanking.accountsService.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.retailBanking.accountsService.model.TransactionList;



@FeignClient("TRANSACTION-SERVICE")
@Component
public interface TransactionClient {
	
	@GetMapping(value="account/{accountNo}")
	public TransactionList getTransactionByAccount(@PathVariable("accountNo") double no);
	

}
