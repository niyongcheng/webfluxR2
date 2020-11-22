package com.herbalife.is.webfluxdemo.service.impl;

import com.herbalife.is.webfluxdemo.dao.OrderHeaderRepostory;
import com.herbalife.is.webfluxdemo.entity.OrderHeaderEntity;
import com.herbalife.is.webfluxdemo.service.OrderHeaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderHeaderServiceImp implements OrderHeaderService {

    private OrderHeaderRepostory orderHeaderRepostory;

    @Autowired
    public OrderHeaderServiceImp(OrderHeaderRepostory orderHeaderRepostory){
        this.orderHeaderRepostory = orderHeaderRepostory;
    }

    @Override
    public Mono<OrderHeaderEntity> save(OrderHeaderEntity orderHeaderEntity) {
        Mono<OrderHeaderEntity> orderHeaderEntityMono = this.orderHeaderRepostory.save(orderHeaderEntity);
        return orderHeaderEntityMono;
    }
}
