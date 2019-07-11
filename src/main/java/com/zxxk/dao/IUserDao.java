package com.zxxk.dao;

import com.zxxk.model.User;

public interface IUserDao {
    User selectUser(long id);
}
