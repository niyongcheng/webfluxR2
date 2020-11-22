package com.herbalife.is.webfluxdemo.controller;

import com.herbalife.is.webfluxdemo.entity.OrderHeaderEntity;
import com.herbalife.is.webfluxdemo.service.OrderHeaderService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    private OrderHeaderService orderHeaderService;

    public OrderController(OrderHeaderService orderHeaderService){
        this.orderHeaderService = orderHeaderService;
    }

    @GetMapping("name")
    public Flux<String> getName(){
        return Flux.just("hello","world","it is nice") ;
    }

    @GetMapping("monoString")
    public Mono<String> getNameFrom(){
        return Mono.just("hello, this is mono string");
    }

    @PostMapping("orderHeader")
    public Mono<OrderHeaderEntity> orderHeaderSave(@RequestBody OrderHeaderEntity orderHeaderEntity){
        return this.orderHeaderService.save(orderHeaderEntity);
    }
}
