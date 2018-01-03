package com.didispace.service;

import com.didispace.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface UserService {

    List<User> getUserInfo();

    void addUser(User user);

    User getUserById(Long id);

    void editUser(User user, Long id);

    void delUser(Long id);
}
