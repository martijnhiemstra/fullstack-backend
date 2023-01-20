package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 3600)
public class ReserveringController {

	@Autowired
	private IReserveringRepository repo;
	
	@RequestMapping(value="reserveringen")
	public List<Reservering> reserveringen() {
		// Database uitlezen
		return repo.findAll();
	}
	
}
