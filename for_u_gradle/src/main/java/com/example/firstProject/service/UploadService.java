package com.example.firstProject.service;


import com.example.firstProject.entity.upload;
import com.example.firstProject.repository.uploadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;

@Service
public class UploadService {
    @Autowired
    uploadRepository uploadRepository;

    public void save (upload file){
         upload f = new upload();

         f.setFileName(file.getFileName());
         f.setFileOrName(file.getFileOrName());
         f.setFileUrl(file.getFileUrl());

         uploadRepository.save(f);
    }
}
