package org.lanqiao.dxzf.service.user.impl;

import java.util.List;

import org.lanqiao.dxzf.entity.Menu;
import org.lanqiao.dxzf.mapper.user.MenuMapper;
import org.lanqiao.dxzf.service.user.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MenuServiceImpl implements MenuService {
	@Autowired
	MenuMapper menuMapper;
	public int insert(Menu menu) {
		// TODO Auto-generated method stub
		return menuMapper.insert(menu);
	}

	public int delete(Integer mid) {
		// TODO Auto-generated method stub
		return menuMapper.delete(mid);
	}

	public int update(Menu menu) {
		// TODO Auto-generated method stub
		return menuMapper.update(menu);
	}

	public List<Menu> find(Menu menu) {
		// TODO Auto-generated method stub
		return menuMapper.find(menu);
	}

}
