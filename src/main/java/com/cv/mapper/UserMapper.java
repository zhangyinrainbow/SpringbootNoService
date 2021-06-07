package com.cv.mapper;

import com.cv.entity.User;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface UserMapper {
    List<User> queryUser();
    User queryUserById(Integer id);
    boolean addUser(User user);
    boolean deleteUserById(Integer id);
    boolean deleteUser(User user);
    boolean updateUser(User user);
    User queryUserByName(String name);
}
