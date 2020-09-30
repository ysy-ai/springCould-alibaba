package com.yi.dao;

import com.yi.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;

@Mapper
public interface ProductDao extends JpaRepository<Product,Integer> {
}
