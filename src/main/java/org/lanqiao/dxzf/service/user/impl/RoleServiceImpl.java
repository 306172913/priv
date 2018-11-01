package org.lanqiao.dxzf.service.user.impl;

import java.util.ArrayList;
import java.util.List;

import org.lanqiao.dxzf.entity.Role;
import org.lanqiao.dxzf.entity.RoleMenu;
import org.lanqiao.dxzf.mapper.user.RoleMapper;
import org.lanqiao.dxzf.mapper.user.RoleMenuMapper;
import org.lanqiao.dxzf.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class RoleServiceImpl implements RoleService {
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	RoleMenuMapper roleMenuMapper;
	public int insert(Role role) {
		// TODO Auto-generated method stub
		//System.out.println(" role的rid为"+role.getRid());
		int row = roleMapper.insert(role);	//返回影响的行数
		//System.out.println("本次插入角色的rid为"+rid+" role的rid为"+role.getRid());
		String menus = role.getMenus();//获取所有权限  mid 例如( 1,2,3,4,5,6,7  )
		//判断是否为空
		if(!"".equals(menus)){
			String[] strMids = role.getMenus().split(",");
			List<RoleMenu> list = new ArrayList<RoleMenu>();
			for(int i=0;i<strMids.length;i++){
				RoleMenu rm = new RoleMenu(null,role.getRid(),Integer.parseInt(strMids[i]));
				list.add(rm);
			}
			//授权操作中间表
			roleMenuMapper.insertRoleMenu(list);
		}
		return row;
	}

	public int delete(Integer rid) {
		// TODO Auto-generated method stub
		return roleMapper.delete(rid);
	}

	public int update(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.update(role);
	}

	public List<Role> find(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.find(role);
	}

}
