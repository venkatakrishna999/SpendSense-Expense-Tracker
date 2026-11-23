
package com.vcube.SpendSense.service;
//what to do
import java.util.List;

import com.vcube.SpendSense.model.Expense;

public interface ExpenseService {
	
	public abstract Expense createExpense(Expense expense);
	
	public abstract List<Expense> getAllExpenses();
	
	public abstract Expense getExpenseById(Long id);
	
	public abstract Expense updateExpenseById(Expense expense,Long id);
	
	public void deleteExpense(Long id);
	
	public abstract List<Expense> getExpensesByCategory(String category);

}
