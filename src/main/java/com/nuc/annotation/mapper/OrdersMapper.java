package com.nuc.annotation.mapper;

import com.nuc.annotation.pojo.Orders;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Repository
public interface OrdersMapper {
//    一对一
    @Select("select * from orders where oid = #{oid}")
    @Results(id = "ordersResult",value = {
            @Result(id = true ,property = "oid",column = "oid"),
            @Result(property = "uid" ,column = "user_id"),
            @Result(property = "user" ,column = "user_id",
            one = @One(select = "com.nuc.annotation.mapper.UserMapper.findUserByUid"))
    })
    //注意：这儿的one 是指 order和用户一对一 后面加的是用户方法的路径
    // 同理：分步查询 ，在这儿获取到的user_id 将会作为 findUserByUid 中的uid来查找
    Orders findOrdersByOid(Integer oid);

    /**
     * 通过uid来获取属于用户的全部订单
     * @param: uid
     * @return: Orders
    **/
    @Select("select * from orders where user_id =#{uid}")
    @Results(id = "OrdersResult2" ,value = {
            @Result(id = true ,property = "oid",column = "oid"),
            @Result(property = "uid" ,column = "user_id")
    })
    List<Orders> findOrdersByUid(Integer uid);


    @Insert("insert into orders(oid,user_id,number,createtime,note,order_name)" +
            "values (#{oid},#{uid},#{number},#{createTime},#{note},#{orderName})")
    @Options(useGeneratedKeys = true,keyProperty = "oid",keyColumn = "oid")
    //useGeneratedKeys表示主键是否自增,keyProperty表示属性中的主键
    int insertOrders(Orders orders);


    @Update("update orders set user_id =#{uid},number =#{number},createtime=#{createTime},note=#{note},order_name=#{orderName} where oid=#{oid}")
    int update(Orders orders);

    @Delete("delete from orders where oid=#{oid}")
    int delete(Integer oid);
}
