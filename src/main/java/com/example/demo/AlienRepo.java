package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.mode.Alien;

public interface AlienRepo  extends JpaRepository<Alien,Integer>{

}
