package io.gls.jcartadministartionback.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/image")
public class ImageConteroller {

    @PostMapping("/upload")
    public String upload(MultipartFile image){
        return null;
    }
}
