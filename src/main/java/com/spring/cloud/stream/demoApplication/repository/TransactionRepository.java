package com.spring.cloud.stream.demoApplication.repository;

import com.spring.cloud.stream.demoApplication.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Integer> {

    Transaction findById(int id);

}