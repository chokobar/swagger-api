package com.playground.api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class SwaggerDTO {

    @Schema(description = "게시물 제목", example = "Title")
    private String title;

    @Schema(description = "게시물 내용", example = "Content")
    private String content;

    @Schema(description = "실행 날짜", example = "YYYY-MM-DD HH:mm:ss")
    private String createDate = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));


}