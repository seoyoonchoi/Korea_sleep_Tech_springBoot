package com.example.korea_sleepTech_springboot.이론;

public class S_Webflux {
}

/*
=====Spring Webflux=====
1. 개요
 : Spring 5에서 도입
 : 리액티브 프로그래밍 기반 웹 프레임워크
 -전통적인 Spring MVC가 Servlet을 기반으로 동기 처리
 -WebFlux는 논블로킹(Non-Blocking) 방식으로 동작

 >>즉, 많은 요청이 동시에 오더라도 요청 - 응답 쓰레드가 점유되지 않고 효율적으로 처리한다
 (고성능 서버에 적합함)

 cf) 논블로킹 방식(Non - Blocking)
    : 요청을 보낸 후 결과가 올 때까지 기다리지 않고, 다른 작업을 처리한다
 cf) 블로킹 작업
    : 요청을 보내고 결과가 올때까지 기다리는 작업
    - JPA(JDBC), 파일IO, 메일 전송(SMTP서버 응답을 기다림)
 cf) 요청 - 응답 쓰레드가 점유
    : HTTP요청 처리 시, 해당 요청에 대해 하나의 쓰레드가 계속 점유되는 상태
    - 요청 1건당 쓰레드 1개를 할당(Tomcat 기본 방식)
2. WebFlux의 핵심 문법
 1) Mono<T>
    : 0or1개의 데이터를 비동기적으로 처리
 2) Flux<T>
    :0개 이상의 데이터를 비동기 스트림으로 처리
 3) subscribeOn(schedulers.boundedElastic())
    : 블로킹작업 (IO, DB)을 백그라운드 쓰레드에서 처리
 4) onErrorResume
    : 에러가 발생하면 대체 동작을 수행한다

3. WebFlux 사용 목적
성능측면
    - 많은 사용자가 동시에 요청헤도 쓰레드 점유율이 낮음
    - DB, 메일, 파일 IO 등 시간이 오래 걸리는 작업을 별도 쓰레드에서 수행 가능

4. WebFlux도입 시 주의 점
    - JpaRepository는 블로킹
        : JPA를 사용한다면 완벽한 리액티브가 아님(R2DBC로 변경하여야 완전한 논블로킹)
    - 모든 리턴 타입이 Mono 또는 Flux
        : Spring MVC처럼 단순히 String 또는 ResponseEntity를 리턴하면 안됨
    - 스케쥴러를 선택하는 것은 중요하다
        : DB, mail, file 등 blocking 작읍은 Schedulers.boundedElastic()사용해야함

5. 전체 구조에서의 WebFlux 흐름
[1] 사용자가 이메일 입력 후 인증 요청
[2] Mono 비동기로 이메일 전송 로직을 실행
[3] JWT 토큰 생성 및 이메일 발송(BoundedElastic Scheduler)
[4] 응답 : 인증 이메일 전송 완료



* */