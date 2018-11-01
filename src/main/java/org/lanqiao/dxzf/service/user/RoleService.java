package org.lanqiao.dxzf.service.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Role;

public interface RoleService {
	/**
	 * 添加角色
	 * @param role
	 * @return
	 */
	public int insert(Role role);
	/**
	 * 删除角色
	 * @param rid
	 * @return
	 */
	public int delete(Integer rid);
	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	public int update(Role role);
	/**
	 * 查询角色
	 * @param role
	 * @return
	 */
	public List<Role> find(Role role);
}
