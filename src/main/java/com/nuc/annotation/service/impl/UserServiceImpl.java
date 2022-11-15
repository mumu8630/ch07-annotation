package com.nuc.annotation.service.impl;

import com.nuc.annotation.mapper.UserMapper;
import com.nuc.annotation.pojo.User;
import com.nuc.annotation.service.UserService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public User getUserByUid(Integer uid) {
        return userMapper.findUserOrdersByUid(uid);
    }
}
