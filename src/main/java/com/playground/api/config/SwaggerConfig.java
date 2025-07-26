package com.playground.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {

        // http://localhost:8080/swagger-ui/index.html
        // 로컬 서버
        Server server = new Server();
        server.setUrl("/");  // 상대 경로

        // 운영 서버
        Server prodServer = new Server();
        prodServer.setUrl("https://api.example.com");  // 운영 서버 URL

        // API 정보
        Info info = new Info()
                .title("Swagger API")       // API 문서 제목
                .version("v1.0.0")          // API 버전
                .description("Swagger API 문서"); // 설명

        return new OpenAPI()
                .info(info)
                .servers(List.of(server, prodServer));
    }
}
