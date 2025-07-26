package com.playground.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SwaggerDTO {

    @Schema(description = "게시물 제목", example = "My First Post")
    private String title;

    @Schema(description = "게시물 내용", example = "Hello Swagger!")
    private String content;
}