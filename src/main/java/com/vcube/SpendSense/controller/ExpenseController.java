package com.vcube.SpendSense.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.SpendSense.model.Expense;
import com.vcube.SpendSense.service.ExpenseService;
//http://localhost:7777/expense/crExpense
@RestController
@RequestMapping("/expense")
public class ExpenseController {
	@Autowired
	ExpenseService expenseService;
	
	@GetMapping("/hello")
	String hello(){
		return "Spend Sence Tracker Created Successfully";
		
	}
	
	@GetMapping("/getExpenses")
	List<Expense>getAllExpenses(){
		return expenseService.getAllExpenses();
	}
	
	@GetMapping("/getExpense/{id}")
	Expense getExpenses(@PathVariable Long id){
		return expenseService.getExpenseById(id);
	}
	
	@DeleteMapping("delEx/{id}")
	String deleteExpense(@PathVariable Long id) {
		expenseService.deleteExpense(id);
		return "Deleted Expense Successfully with the id of : " + id;
	}
	
	@PutMapping("updateEx/{id}")
	Expense updateExpense(@RequestBody Expense expense,@PathVariable Long id) {
		return expenseService.updateExpenseById(expense,id);
	}
	
	@PostMapping("crExpense")
	Expense createExpense(@RequestBody Expense expense) {
		return expenseService.createExpense(expense);
	}
	
	@GetMapping("getExByCat/{category}")
	List<Expense> getExpensesByCategory(@PathVariable String category){
		return  expenseService.getExpensesByCategory(category);
	}

}
