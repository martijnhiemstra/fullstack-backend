package com.example.demo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservering {

	// reserveringsnummer
	// datum
	// kosten
	
	// Primary key - Auto increment
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	
	@Column(nullable = false) // NULL
	public int reservationNumber; // camelcase
	
	@Column(nullable = false) // NULL
	public LocalDateTime date;
	
	@Column(nullable = false) // NULL
	public double costs;
	
}
