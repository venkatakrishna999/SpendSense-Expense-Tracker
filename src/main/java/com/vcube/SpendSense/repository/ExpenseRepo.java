package com.vcube.SpendSense.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vcube.SpendSense.model.Expense;


@Repository
public interface ExpenseRepo extends JpaRepository<Expense, Long> {

public abstract List<Expense>findByCategory(String category);
}
