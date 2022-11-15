package com.nuc.annotation.service;

import com.nuc.annotation.pojo.Orders;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
public interface OrdersService {
    Orders getOrdersByOid(Integer oid);
    int insert(Orders orders);
}
