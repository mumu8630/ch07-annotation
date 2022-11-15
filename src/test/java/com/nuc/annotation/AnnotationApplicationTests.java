package com.nuc.annotation;

import com.nuc.annotation.mapper.OrdersMapper;
import com.nuc.annotation.mapper.UserMapper;
import com.nuc.annotation.pojo.Orders;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class AnnotationApplicationTests {

    @Autowired
    OrdersMapper ordersMapper;
    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() {
        System.out.println(ordersMapper.findOrdersByOid(7));
        System.out.println(userMapper.findUserByUid(37));
    }
    @Test
    void test2(){
        System.out.println(userMapper.findUserOrdersByUid(10));
        //System.out.println(ordersMapper.findOrdersByUid(36));
    }
    @Test
    void test3(){
        System.out.println(userMapper.getAllUser());
    }
    @Test
    void test4(){
    ordersMapper.insertOrders(new Orders(null, 10, 12, "1846-6-2", "吸烟有害健康", "煊赫门"));
    }
    @Test
    void test5(){
        ordersMapper.update(new Orders(11,36,10,"2001-5-3","吸了都说好","南京"));
    }

    @Test
    void test6(){
        System.out.println(ordersMapper.delete(13));
    }

}
