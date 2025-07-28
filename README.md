# Swagger API Playground

## 📖 개요
Spring Boot와 Swagger(OpenAPI 3) 기반으로 만든 API 문서화 연습용 프로젝트입니다.  
간단한 게시물 조회/등록 API를 작성하고, Swagger UI를 통해 테스트할 수 있도록 구성했습니다.

---

## 🛠 기술 스택
- Java 17
- Spring Boot 3.4
- Springdoc OpenAPI (Swagger UI)
- Gradle

---

## 🔍 주요 기능
- Swagger(OpenAPI 3) 기반 API 문서 자동화
- 게시물 조회 (`GET /api/v1/posts`)
- 게시물 등록 (`POST /api/v1/posts`) – DTO 요청/응답 처리
- 로컬 및 운영 서버 URL 설정 (Profiles)
- Swagger UI를 통한 API 테스트 지원

---

## 🧪 학습 포인트
- Springdoc OpenAPI를 활용한 Swagger 설정
- `@Operation`, `@ApiResponses`, `@Schema` 애너테이션으로 문서화
- DTO 기반 요청/응답 구조 정의
- Swagger UI에서 JWT 인증 및 서버 환경 분기(확장 가능)

