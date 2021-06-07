package com.cv.controller;

import com.cv.entity.User;
import com.cv.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    UserMapper userMapper;
    @RequestMapping(value = "/queryuserbyid", method = RequestMethod.GET)
    /**这里的@RequestParam可有可无*/
    public User getUserById(@RequestParam(value = "id") Integer id){
        return userMapper.queryUserById(id);
    }
    @GetMapping("/{id}")
    public User getUserByIdTwo(@PathVariable(value = "id")Integer id){
        return userMapper.queryUserById(id);
    }
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(User user){
        return userMapper.addUser(user);
    }

    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public boolean updateUser(User user){
        return userMapper.updateUser(user);
    }

    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    public boolean deleteUserById(Integer id){
        return userMapper.deleteUserById(id);
    }
}
