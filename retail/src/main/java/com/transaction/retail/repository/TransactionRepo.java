package com.transaction.retail.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transaction.retail.model.Transaction;


public interface TransactionRepo extends JpaRepository<Transaction,Double> {

}
