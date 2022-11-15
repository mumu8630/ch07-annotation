package com.nuc.annotation.service.impl;

import com.nuc.annotation.mapper.OrdersMapper;
import com.nuc.annotation.pojo.Orders;
import com.nuc.annotation.service.OrdersService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    OrdersMapper ordersMapper;
    @Override
    public Orders getOrdersByOid(Integer oid) {
        return ordersMapper.findOrdersByOid(oid);
    }

    @Override
    public int insert(Orders orders) {
        return ordersMapper.insertOrders(orders);
    }
}
