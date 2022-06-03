package com.example.launchpadjava.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.example.launchpadjava.entity.Media;
import com.example.launchpadjava.repository.MediaRepository;
import com.example.launchpadjava.service.MediaService;

@Service
public class MediaServiceImpl implements MediaService{

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public Media uploadImage(MultipartFile file) {
        

        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        try {
            if(fileName.contains("..")){
                return null;
            }
            Media media = Media.builder().fileName(fileName).fileType(file.getContentType()).data(file.getBytes()).build();
            return mediaRepository.save(media);
        } catch (Exception e) {
            //TODO: handle exception
            return null;
        }

    }
    
}
