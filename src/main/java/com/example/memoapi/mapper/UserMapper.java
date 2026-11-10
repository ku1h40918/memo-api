package com.example.memoapi.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.memoapi.dto.User;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT user_ID, username,password,created_at FROM users WHERE username ={username}")
    User selectUserByUserName(String userName);
}
