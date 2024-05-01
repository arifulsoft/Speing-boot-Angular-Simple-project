package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BankController {
	
	//------------insert-----------
	
//	@PostMapping("/save" )
//	public Bank dosave(@RequestBody Bank s) {
//		BankDa da = new BankDa();
//		Bank st=  da.save(s);
//
//		return st;
//	}
	
	
//	//-----------show--------
//	
//List<Bank> pp=new ArrayList<>();
//	
//	@GetMapping("/all")
//	public List<Bank> m2() {
//		BankDa da = new BankDa();
//		pp = da.allstudent();
//
//		return pp;
//	}

	
	//--------------login---------------

	@GetMapping("/{username}/{password}")
	public Bank m3(@PathVariable String username,@PathVariable String password) {
		BankDa da = new BankDa();
		Bank pp = da.search(username, password);
		return pp;
	}
	
	@PutMapping("/update")//variable declaration korte hoy {} er vitore
	public Bank doupdate(@RequestBody  Bank s) {
		BankDa da1= new BankDa();
		Bank up = da1.update(s);// access class er search method finally e hold korbe ja access return kore
		return up;
	}
	
	//----------search by username---------
	
	@GetMapping("/{username}")
	public Bank userSearch(@PathVariable String username) {
		BankDa da = new BankDa();
		Bank sea = da.usearch(username);
		return sea;
	}
	
	//show user data
List<Bank> pp1=new ArrayList<>();
	
	@GetMapping("/show")
	public List<Bank> show() {
		BankDa da = new BankDa();
		pp1 = da.showData();

		return pp1;
	}
	
	//--------delete account
	
	@DeleteMapping("/delete/{username}" )
	public void delete(@PathVariable String username) {
		BankDa da = new BankDa();
		da.delete(username);
	}
	
}