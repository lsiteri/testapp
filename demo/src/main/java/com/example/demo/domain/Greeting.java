package com.example.demo.domain;


public class Greeting {

	Long id;
	String name;
	
	public Greeting(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Greeting [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
