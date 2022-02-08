package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.NapkinRepository;

@Service
@Transactional
public class NapkinService {

	private NapkinRepository napkinRepository;
	
	@Autowired
	public NapkinService(NapkinRepository napkinRepository) {
		super();
		this.napkinRepository = napkinRepository;
	}
}
