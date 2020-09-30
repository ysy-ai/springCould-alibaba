package com.yi.dao;

import com.yi.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface OrderDao extends JpaRepository<Order,Long> {
}
