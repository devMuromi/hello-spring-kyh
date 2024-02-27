[스프링 입문 - 코드로 배우는 스프링 부트, 웹 MVC, DB 접근 기술](https://www.inflearn.com/course/스프링-입문-스프링부트) 강의 수강

# 스프링, 스프링 부트, gradle, 라이브러리

# Thymeleaf, Controller

# MVC, test
Controller/
Service/
Repository, Domain

# Spring container, Java bean 등록
스프링 컨테이너: 자바 객체(Bean)의 생명 주기를 관리

@Component(@Controller, @Service, @Repository...), @Autowired로 등록하고 연결해주기 또는 SpringConfig 파일에서 @Configuration, @Bean으로 한번에 작성해주는 방법이 있다.

# 데이터베이스 연결
DB 연결. gradle등 설정.

레포지토리 implements. 이후 Config에서 레포지토리만 변경해주면 그대로 사용 가능. Dependencies Injection(의존성 주입). 수정이 간편하다.

## 실제 DB에서 테스트
@SpringBootTest로 스프링 컨테이너와 함께 테스트 진행.
@Transactional 를 통해 트랙잭션 실행후 롤백.

# JPA
gradle에 라이브러리 추가. 스프링 부트에도 JPA 설정 추가.
> ddl-auto: 테이블 자동 생성

domain에 @Entity로 엔티티 설정.

JPA 레포지토리 새로 implements.

서비스에 트랜잭션 @Transactional 추가.

## 스프링 데이터 JPA
레포지토리를 클래스가 아닌 인터페이스로 생성 해준다.

스프링 데이터 JPA는 자동으로 메서드 이름만으로 레포지토리 기능들을 자동으로 제공해준다.

# AOP
