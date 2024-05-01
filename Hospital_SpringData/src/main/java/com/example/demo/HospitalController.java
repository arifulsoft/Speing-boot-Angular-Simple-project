package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HospitalController {
	
@GetMapping("/")
	
	public String m1() {		
		return "Spring boot is working";	
	}
	
	List<Appointment> pp=new ArrayList<>();
	
//	@GetMapping("/all")
//	public List<Doctors> m2() {
//		HospitalDA da = new HospitalDA();
//		pp = da.save(null);
//
//		return pp;
//	}
	
	@PostMapping("/save" )
	public void dosave(@RequestBody Appointment s) { //type Student and to catch s we have to use @RequesrBody
		HospitalDA da = new HospitalDA(); //to create relation(to pass data) with another class we have to create a object
		Appointment appointment=  da.saveAppointment(s);

		 //this return has no value to this program
	}

}
