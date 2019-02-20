package com.rakesh.capital;

import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employeeTrade")
public class EmployeeTrade {
	
	@GetMapping("/tradeDetails")
	public ResponseEntity<List> employeeTradeDetails() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Rakesh");
		list.add("Ram ji");
		list.add("Shree Krishna");
		list.add("jai ram");
		
		return new ResponseEntity(list,HttpStatus.OK);
	}
	
	@GetMapping("/trade")
	public ResponseEntity<List> tradeNames() {
		ArrayList <String> list = new ArrayList<String>();
		list.add("computer");
		list.add("Laptop");
		list.add("mobile");
		list.add("watch");
		
		return new ResponseEntity(list,HttpStatus.OK);		
		
	}

	@PostMapping("/enterTrade")
	public ResponseEntity<List> tradeEntry( @RequestBody List<String> list) {
		ArrayList <String> listTrade = new ArrayList<String>();
		listTrade.add("computer");
		listTrade.add("Laptop");
		listTrade.add("mobile");
		listTrade.add("watch");
		listTrade.addAll(list);
		
		return new ResponseEntity(listTrade,HttpStatus.OK);		
		
	}
	
	@PostMapping("/updateTrade")
	public ResponseEntity<List> updateTradeEntry( @RequestBody List list) {
		ArrayList <String> listTrade = new ArrayList<String>();
		listTrade.add("computer");
		listTrade.add("Laptop");
		listTrade.add("mobile");
		listTrade.add("watch");
		listTrade.addAll(list);
		
		return new ResponseEntity(listTrade,HttpStatus.OK);		
		
	}
	
	@PostMapping("/deleteTrade/{id}/name")
	public ResponseEntity<List> deleteTradeEntry( @PathVariable int id, @RequestBody List list) {
		ArrayList <String> listTrade = new ArrayList<String>();
		listTrade.add("computer");
		listTrade.add("Laptop");
		listTrade.add("mobile");
		listTrade.add("watch");
		listTrade.addAll(list);
		
		return new ResponseEntity(listTrade,HttpStatus.OK);		
		
	}
	
	
}
