package com.example.launchpadjava.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.launchpadjava.entity.Media;


@Repository
public  interface MediaRepository extends JpaRepository<Media, String>{
    
}