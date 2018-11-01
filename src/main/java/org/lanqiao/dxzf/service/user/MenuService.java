package org.lanqiao.dxzf.service.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Menu;

public interface MenuService {
	/**
	 * 添加权限
	 * @param role
	 * @return
	 */
	public int insert(Menu menu);
	/**
	 * 删除权限
	 * @param rid
	 * @return
	 */
	public int delete(Integer mid);
	/**
	 * 修改权限
	 * @param role
	 * @return
	 */
	public int update(Menu menu);
	/**
	 * 查询权限
	 * @param role
	 * @return
	 */
	public List<Menu> find(Menu menu);
}
