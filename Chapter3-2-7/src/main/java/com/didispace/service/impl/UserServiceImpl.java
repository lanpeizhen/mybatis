package com.didispace.service.impl;

import com.didispace.domain.User;
import com.didispace.domain.UserMapper;
import com.didispace.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserInfo() {
        return userMapper.getUserInfo();
    }

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void editUser(User user, Long id) {

    }

    @Override
    public void delUser(Long id) {

    }
}
