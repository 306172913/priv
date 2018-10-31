package org.lanqiao.dxzf.mapper.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Role;
import org.lanqiao.dxzf.mapper.BaseMapper;

public interface RoleMapper extends BaseMapper<Role>{
	public List<Role> selectAllRoleByUid(Integer uid);
}
