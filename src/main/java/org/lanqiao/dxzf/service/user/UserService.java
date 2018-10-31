package org.lanqiao.dxzf.service.user;

import java.util.List;

import org.lanqiao.dxzf.entity.User;

public interface UserService {
	/**
	 * 查询所有用户包括模糊查询
	 * @param user
	 * @return
	 */
	public List<User> find(User user);
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public int insert(User user);
	/**
	 * 修改用户信息，修改密码
	 * @param user
	 * @return
	 */
	public int update(User user);
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	public int delete(Integer id);
	/**
	 * 用户登录
	 */
	public User login(User user);
	/**
	 * 查询记录条数
	 */
	public int count();
}
