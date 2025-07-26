package com.playground.api.controller;

import com.playground.api.dto.SwaggerDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/v1")
@Tag(name = "스웨거", description = "스웨거 API")
public class SwaggerController {

    @Operation(summary = "조회", description = "등록된 게시물을 조회합니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "조회 성공"),
            @ApiResponse(responseCode = "400", description = "조회 실패")
    })
    @GetMapping("/posts")
    public String posts() {
        return "ok";
    }

    @PostMapping("/posts")
    public SwaggerDTO addPosts(@RequestBody SwaggerDTO swaggerDTO) {
        log.info("Received DTO: {}", swaggerDTO);
        return swaggerDTO;
    }
}
