package com.example.demo.repository;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.Napkin;

@Repository
public interface NapkinRepository extends JpaRepository<Napkin, BigInteger> {

}
