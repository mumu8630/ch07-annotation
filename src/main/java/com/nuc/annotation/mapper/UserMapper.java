package com.nuc.annotation.mapper;

import com.nuc.annotation.pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Repository
public interface UserMapper {
    @Select("select * from user where id =#{uid}")
    @Results(id = "userResult",value = {
            @Result(id = true,property = "uid",column = "id")
    })
    User findUserByUid(Integer uid);

    /**
     * 通过uid查找用户的所有订单
     * @return: User
    **/
    @Select("select  * from user where id =#{uid}")
    @Results(id = "userOrderResult" ,value = {
            @Result(id = true,property = "uid" ,column = "id"),
            @Result(property = "orders",column = "id",
            many = @Many(select = "com.nuc.annotation.mapper.OrdersMapper.findOrdersByUid"))
    })
    User findUserOrdersByUid(Integer uid);

    /*相较而言 我们还有另一种 注解@ResultMap
      这种注解 可以使我们复用上面已经定义的results
    */
    @Select("select * from user ")
    @ResultMap("userResult")
    List<User> getAllUser();
}
