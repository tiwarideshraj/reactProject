package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cource;
@Repository
public interface courceRepo extends JpaRepository<Cource, Integer>{

}
