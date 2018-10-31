package org.lanqiao.dxzf.mapper.user;

import org.lanqiao.dxzf.entity.User;
import org.lanqiao.dxzf.mapper.BaseMapper;

public interface UserMapper extends BaseMapper<User>{
	/**
	 * 根据用户登录账号查出用户密码
	 */
	public User login(String username);
	/**
	 * 查询数据条数
	 *
	 */
	public int count();
}
