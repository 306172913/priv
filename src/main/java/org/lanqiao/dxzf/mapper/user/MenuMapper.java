package org.lanqiao.dxzf.mapper.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Menu;
import org.lanqiao.dxzf.mapper.BaseMapper;

public interface MenuMapper extends BaseMapper<Menu>{
	public List<Menu> selectAllMenuByUid(Integer uid);
}
