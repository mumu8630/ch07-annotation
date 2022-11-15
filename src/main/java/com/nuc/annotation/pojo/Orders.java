package com.nuc.annotation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    private Integer oid;
    private Integer uid;
    private Integer number;
    private String createTime;
    private String note;
    private String orderName;

//    订单跟用户是一对一的关系
    private User user;

    public Orders(Integer oid, Integer uid, Integer number, String createTime, String note, String orderName) {
        this.oid = oid;
        this.uid = uid;
        this.number = number;
        this.createTime = createTime;
        this.note = note;
        this.orderName = orderName;
    }
}
