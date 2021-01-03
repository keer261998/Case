package com.retailBanking.accountsService.repository;

import java.util.List;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.retailBanking.accountsService.model.Transaction;



@FeignClient(name="transaction-service")
@RibbonClient(name="transaction-service")
@Component
public interface TransactionServiceProxy {
	
	@GetMapping(value="account/{accountNo}",produces = { MediaType.APPLICATION_JSON_VALUE})
	public List<Transaction> getTransactionByAccount(@PathVariable("accountNo") long no);

}
