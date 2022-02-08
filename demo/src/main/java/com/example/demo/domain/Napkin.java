package com.example.demo.domain;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Napkin {

	@Id
	BigInteger id; 
	
	String name;
	
}
