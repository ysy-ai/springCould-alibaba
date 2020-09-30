package com.yi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.activation.DataSource;
import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestController {
    @Resource
    DataSource dataSource;
    @Test
    public void test(){
        System.out.println(dataSource.getClass());
    }
}
