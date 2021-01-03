package com.transaction.retail.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.transaction.retail.model.Transaction;
import com.transaction.retail.repository.TransactionRepo;

@Service
public class TransactionService {


		@Autowired
		private TransactionRepo repo;
		
		
		public List<Transaction> fetchAllTransaction(){
			List<Transaction> tr = repo.findAll();
			System.out.println("Getting details from db: "+tr);
			return tr;
		}
		
		//method to fetch recent 5 transaction by account number 
		public List<Transaction> fetchTransactionByAccount(long no) {
			List<Transaction> tr = repo.findAll().stream()
					.filter(tra -> tra.getAccountNo() == no)
					.sorted(Comparator.comparing(Transaction::getDate).reversed())
					.limit(5)
					.collect(Collectors.toList());
			return tr;
		}
		


	}



