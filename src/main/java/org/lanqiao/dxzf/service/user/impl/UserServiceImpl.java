package org.lanqiao.dxzf.service.user.impl;

import java.util.List;

import org.lanqiao.dxzf.entity.User;
import org.lanqiao.dxzf.mapper.user.UserMapper;
import org.lanqiao.dxzf.service.user.UserService;
import org.lanqiao.dxzf.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;
	public List<User> find(User user) {
		// TODO Auto-generated method stub
		return userMapper.find(user);
	}

	public int insert(User user) {
		// TODO Auto-generated method stub
		String password = MD5Util.getData(user.getPassword());
		user.setPassword(password);
		return userMapper.insert(user);
	}

	public int update(User user) {
		// TODO Auto-generated method stub
		return userMapper.update(user);
	}

	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return userMapper.delete(id);
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		/**
		 * 获取数据库的密码
		 */
		User reuser = userMapper.login(user.getUsername());
		String password = user.getPassword();
		/**
		 * 通过登录账号得到密码
		 */
		String pass = MD5Util.getData(user.getPassword());
		if(pass.equals(password)){	//密码相同，登录成功
			return reuser;
		}
		return null;	//登录失败
	}

}
