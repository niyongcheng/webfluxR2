package com.herbalife.is.webfluxdemo.service;

import com.herbalife.is.webfluxdemo.entity.OrderHeaderEntity;
import reactor.core.publisher.Mono;


public interface OrderHeaderService {
    Mono<OrderHeaderEntity> save(OrderHeaderEntity orderHeaderEntity);
}
