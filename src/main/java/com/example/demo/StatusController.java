package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

	@RequestMapping(value="status")
	public String status() {
		return "OK";
	}

	@RequestMapping(value="getal")
	public int getal() {
		return 12;
	}

	@RequestMapping(value="r")
	public Reservering res() {
		// new
		Reservering r = new Reservering();
		r.reservationNumber = 1234;
		r.costs = 80.69;
		r.date = LocalDateTime.now();
		return r;
	}
	
}
