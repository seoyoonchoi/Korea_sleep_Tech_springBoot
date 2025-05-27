package com.example.korea_sleepTech_springboot.service;

import com.example.korea_sleepTech_springboot.dto.file.PostRequestDto;
import com.example.korea_sleepTech_springboot.dto.file.PostResponseDto;
import com.example.korea_sleepTech_springboot.dto.response.ResponseDto;
import jakarta.validation.Valid;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface PostDataService {
    ResponseDto<PostResponseDto> createPost(@Valid PostRequestDto dto, MultipartFile file) throws IOException;
}
