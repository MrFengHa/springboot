package com.home.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件描述
 * 文件上传
 * @Author 冯根源
 * @create 2020/5/14 18:31
 */
@RestController
public class FileUploadController {
    /**
     * 文件上传
     */
    @PostMapping("/fileuploadController")
    public String fileUpload(MultipartFile file) throws IOException {

        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("d:/"+file.getOriginalFilename()));
        return "OK";
    }
}
