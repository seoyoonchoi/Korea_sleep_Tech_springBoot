package com.example.korea_sleepTech_springboot.service.implementations;

import com.example.korea_sleepTech_springboot.dto.order.OrderRequestDto;
import com.example.korea_sleepTech_springboot.dto.order.OrderResponseDto;
import com.example.korea_sleepTech_springboot.dto.response.ResponseDto;
import com.example.korea_sleepTech_springboot.entity.Stock;
import com.example.korea_sleepTech_springboot.repository.OrderItemRepository;
import com.example.korea_sleepTech_springboot.repository.OrderRepository;
import com.example.korea_sleepTech_springboot.repository.ProductRepository;
import com.example.korea_sleepTech_springboot.repository.StockRepository;
import com.example.korea_sleepTech_springboot.service.OrderService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final ProductRepository productRepository;
    private final StockRepository stockRepository;
    private final OrderRepository orderRepository;
    private final OrderItemRepository orderItemRepository;

    @Override
    @Transactional
    //주문 생성 시
    //주문 정보가 orders, order_items 테이블에 저장
    //+주문 기록이 order_logs 테이블에 자동 저장
    public ResponseDto<OrderResponseDto> placeOrder(String userId, OrderRequestDto dto) {
        return null;
    }
}
