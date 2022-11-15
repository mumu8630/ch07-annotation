package com.nuc.annotation.service;

import com.nuc.annotation.pojo.User;

/**
 * @author 86186
 * @createDate:2022/11/11
 * @since
 */
public interface UserService {
    User getUserByUid(Integer uid);
}
