# CodeTune Backend

CodeTune MVP의 코드 피드백 백엔드 골격입니다. 사용자가 수정한 코드를 실행하지 않고, 문제의 검토 기준과 변경 내용을 바탕으로 AI 정적 피드백을 제공하는 구조를 지향합니다.

## 기술 스택

- Java 21
- Spring Boot 3.5
- Spring Security / JWT (연동 예정)
- Spring Data JPA / PostgreSQL (연동 예정)
- Gradle
- Docker Compose / Nginx
- GitHub Actions

## 패키지 구조

```text
com.codetune.backend
├── feedback
│   ├── application       # 피드백 유스케이스와 서비스 경계
│   ├── domain            # 피드백 모델과 외부 의존성 포트
│   ├── infrastructure    # AI, diff, persistence 어댑터 자리
│   └── presentation      # REST API 자리
├── problem
│   └── domain            # 문제 모델과 저장소 포트
└── security              # Spring Security/JWT 자리
```

현재 단계에서는 API, 데이터베이스, JWT, Gemini 호출의 실제 구현을 포함하지 않습니다.

## 로컬 실행 준비

Java 21과 Docker가 필요합니다.

```bash
docker compose up -d postgres
./gradlew bootRun
```

PostgreSQL 연결은 이후 JPA 어댑터 구현 시 활성화합니다. 현재 애플리케이션은 데이터소스 자동 설정을 비활성화해 DB 없이도 골격을 실행할 수 있습니다.

## 환경변수

`.env.example`을 참고하세요. 실제 비밀 값이 담긴 `.env`는 커밋하지 않습니다.

## 향후 구현 범위

- `POST /api/problems/{problemId}/feedback`
- PostgreSQL 기반 문제/피드백 저장소 어댑터
- JWT 발급 및 인증 필터
- Gemini Provider와 모델 식별자
- AI JSON 응답 및 코드 라인 검증
