package com.example.launchpadjava.service;

import org.springframework.web.multipart.MultipartFile;

import com.example.launchpadjava.entity.Media;

public interface MediaService {
    Media uploadImage(MultipartFile file);
}
