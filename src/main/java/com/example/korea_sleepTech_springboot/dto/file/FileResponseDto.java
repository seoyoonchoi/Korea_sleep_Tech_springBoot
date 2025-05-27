package com.example.korea_sleepTech_springboot.dto.file;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FileResponseDto {
    private String originalName;
    private String fileName;
    private String filePath;
    private String fileType;
    private long fileSize;
}
