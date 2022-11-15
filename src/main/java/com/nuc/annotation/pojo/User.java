package com.nuc.annotation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer uid;
    private String userName;
    private Date birthday;
    private String sex;
    private String address;

//    一对多 一个用户应该有多个订单
    private List<Orders> orders;
}
