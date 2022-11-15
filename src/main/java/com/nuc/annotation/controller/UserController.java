package com.nuc.annotation.controller;

import com.nuc.annotation.pojo.User;
import com.nuc.annotation.service.UserService;
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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/{id}")
    @ResponseBody
    public User getUserOrders(@PathVariable("id") Integer uid){
        return userService.getUserByUid(uid);
    }
}
