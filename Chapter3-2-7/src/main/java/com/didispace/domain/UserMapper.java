package com.didispace.domain;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO pm_user_info(id, user_name, age, user_desc) VALUES(#{user.id},#{user.userName}, #{user.age}, #{user.userDesc})")
    int insert(@Param("user") User user);

    @Select("SELECT * FROM pm_user_info")
    List<User> getUserInfo();

    @Select("SELECT * FROM pm_user_info where id = #{id}")
    User getUserById(@Param(("id")) Long id);
}