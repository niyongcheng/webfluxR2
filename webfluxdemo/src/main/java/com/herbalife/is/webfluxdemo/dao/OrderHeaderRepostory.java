package com.herbalife.is.webfluxdemo.dao;

import com.herbalife.is.webfluxdemo.entity.OrderHeaderEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderHeaderRepostory extends ReactiveCrudRepository<OrderHeaderEntity,Integer> {
}
