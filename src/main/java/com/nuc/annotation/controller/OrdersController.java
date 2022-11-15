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
    public Orders getOrders(@PathVariable("id") Integer oid) {
        return ordersService.getOrdersByOid(oid);
    }

}
