package com.example.launchpadjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.launchpadjava.entity.Pool;

public interface PoolRepository extends JpaRepository<Pool, Long>{
    
}
