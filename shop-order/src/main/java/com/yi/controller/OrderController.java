package com.yi.controller;

import com.alibaba.fastjson.JSON;
import com.yi.domain.Order;
import com.yi.domain.Product;
import com.yi.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @author yisy
 *订单微服务
 */
@RestController
@Slf4j
public class OrderController {
    @Autowired
    private RestTemplate restTemplate;

    @Resource
    private OrderService orderService;

    /**
     * 用户下单
     */
    @RequestMapping("/order/{pid}")
    public void order(@PathVariable("pid") Integer pid){
        log.info("接收到｛｝号商品的下单请求，调用商品微服务查看商品信息",pid);
        Product product = restTemplate.getForObject("http://localhost:8081/product/" + pid, Product.class);
        log.info("接收到｛｝号商品的信息为：",pid, JSON.toJSONString(product));

        //下单(创建订单)
        Order order = new Order();
        order.setUid(1);
        order.setUsername("测试用户");
        order.setPid(product.getPid());
        order.setPname(product.getPname());
        order.setPprice(product.getPprice());
        order.setNumber(1);

        orderService.createOrder(order);

        log.info("下单成功");

    }
}
