package com.example.linkedin.posts_service.dto;

import lombok.Data;

//@Data
public class PostCreateRequestDto {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
