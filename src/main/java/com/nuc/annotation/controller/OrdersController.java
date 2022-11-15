package com.nuc.annotation.controller;

import com.nuc.annotation.pojo.Orders;
import com.nuc.annotation.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    OrdersService ordersService;

    @GetMapping("/{id}")
    @ResponseBody
    public Orders getOrders(@PathVariable("id")Integer oid){
       return ordersService.getOrdersByOid(oid);
    }

    @GetMapping("/insert")
    @ResponseBody
    //insert into orders(oid,user_id,number,createtime,note,order_name)" +
    //            "values (#{oid},#{uid},#{number},#{createTime},#{note},#{orderName})
    public Orders insert(){
        Orders orders = new Orders();
        orders.setOid(null);
        orders.setUid(36);
        orders.setNumber(13);
        orders.setCreateTime("2021-3-5");
        orders.setNote("五毛钱");
        orders.setOrderName("小布丁");
        ordersService.insert(orders);
        return orders;
    }
}
