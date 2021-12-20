package com.example.shardingjdbcdemo;

import com.example.shardingjdbcdemo.mapper.OrderMapper;
import com.example.shardingjdbcdemo.model.OrderModel;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class ShardingJdbcDemoApplicationTests {

    @Resource
    private OrderMapper orderMapper;

    @Test
    public void insertShardingJdbcDemo(){
        OrderModel orderModel = new OrderModel();
        orderModel.setMemberId(1L);
        orderModel.setPieceKey(1L);
        orderModel.setSerialId("sz123456");
        orderModel.setStatus(1);
        orderMapper.insert(orderModel);
        OrderModel orderModel2 = new OrderModel();
        orderModel2.setMemberId(2L);
        orderModel2.setPieceKey(2L);
        orderModel2.setSerialId("hz987654");
        orderModel2.setStatus(2);
        orderMapper.insert(orderModel2);
    }

    @Test
    public void selectShardingJdbcDemo(){
        System.out.println(orderMapper.selectList());
    }

}
