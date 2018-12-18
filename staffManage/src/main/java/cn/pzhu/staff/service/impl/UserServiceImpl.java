package cn.pzhu.staff.service.impl;

import cn.pzhu.staff.dao.dao.UserDetailMapper;
import cn.pzhu.staff.dao.dao.UserMapper;
import cn.pzhu.staff.domain.User;
import cn.pzhu.staff.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

  @Autowired
  private UserMapper userMapper;


  @Override
  public User selectByUser(User user) {
    return userMapper.selectOne(user);
  }
}
