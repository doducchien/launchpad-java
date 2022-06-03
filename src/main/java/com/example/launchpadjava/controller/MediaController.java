package com.example.launchpadjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.launchpadjava.dto.BaseResponse;
import com.example.launchpadjava.entity.Media;
import com.example.launchpadjava.service.MediaService;

@RestController
@CrossOrigin()
@RequestMapping("/media")
public class MediaController {
    @Autowired
    MediaService mediaService;


    @PostMapping("")
    ResponseEntity<BaseResponse<Boolean>> uploadMedia(@RequestParam("media") MultipartFile file){
        // Media media = mediaService.uploadImage(file);
        BaseResponse<Boolean> baseResponse = new BaseResponse<Media>(true, "success", media);
        return ResponseEntity.status(HttpStatus.CREATED).body(baseResponse);
    }

}
