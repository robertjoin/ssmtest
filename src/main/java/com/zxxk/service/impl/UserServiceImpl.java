package com.zxxk.service.impl;

import com.zxxk.dao.IUserDao;
import com.zxxk.model.User;
import com.zxxk.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;
    @Override
    public User selectUser(long userId) {
        return userDao.selectUser(userId);
    }
}
