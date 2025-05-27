package com.example.korea_sleepTech_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLog extends JpaRepository<OrderLog, Long> {
}
