package com.vcube.SpendSense.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.SpendSense.exception.ExpenseNotFoundException;
import com.vcube.SpendSense.model.Expense;
import com.vcube.SpendSense.repository.ExpenseRepo;



//how to do
//perform business logic
@Service
public class ExpenseServiceImpl implements ExpenseService {

	@Autowired
	ExpenseRepo expenseRepo;
	
	@Override
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}

	@Override
	public List<Expense> getAllExpenses() {
      return expenseRepo.findAll();
		
	}

	@Override
	public Expense getExpenseById(Long id) {
		 return expenseRepo.findById(id).orElseThrow(()-> new ExpenseNotFoundException("Expense Not Found with ID" + id));
		
	}

	@Override
	public Expense updateExpenseById(Expense expense, Long id) {
		 Expense expenseFromDb = getExpenseById(id);
	   
		 expenseFromDb.setAmount(expense.getAmount());
		 expenseFromDb.setCategory(expense.getCategory());
		 expenseFromDb.setExpenseDate(expense.getExpenseDate());
		 expenseFromDb.setPaymentMode(expense.getPaymentMode());
		 expenseFromDb.setTitle(expense.getTitle());
		 
		 return expenseRepo.save(expenseFromDb);
		 
	}

	@Override
	public void deleteExpense(Long id) {
		
		expenseRepo.deleteById(id);
		
	}
	@Override
	public List<Expense> getExpensesByCategory(String category) {
      return expenseRepo.findByCategory(category);
		
	}

}
