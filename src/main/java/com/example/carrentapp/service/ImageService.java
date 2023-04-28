package com.example.carrentapp.service;

import com.example.carrentapp.model.Image;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ImageService {
    Image create(MultipartFile multipartFile);
    List<Image> getAll();
    Image getById(Long id);
    Boolean deleteByName(String name);
}
