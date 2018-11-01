package org.lanqiao.dxzf.controller.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Menu;
import org.lanqiao.dxzf.entity.Role;
import org.lanqiao.dxzf.entity.User;
import org.lanqiao.dxzf.entity.UserTable;
import org.lanqiao.dxzf.service.user.MenuService;
import org.lanqiao.dxzf.service.user.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RoleController {
	@Autowired
	RoleService roleService;
	@Autowired
	MenuService menuService;
	/**
	 * 角色主界面
	 * @return
	 */
	@RequestMapping("user/role_main.do")
	public String role_main(){
		return "user/role_main";
	}
	/**
	 * 查询所有角色信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/findAllRole.do")
	public UserTable findAllUser(){
		//查询列表数据
		List<Role> listRole = roleService.find(null);
		UserTable userTable = new UserTable();
		List<Object> data = userTable.getData();
		for(Role role:listRole){
			data.add(role);
			System.out.println(role);
		}
		return userTable;
	}
	/**
	 * 添加角色界面,把所有权限查询出来在前端遍历装入checkbox
	 * @return
	 */
	@RequestMapping("user/role_add.do")
	public String role_add(Model model){
		List<Menu> listMenu = menuService.find(null);
		model.addAttribute("listMenu", listMenu);
		return "user/role_add";
	}
	/**
	 * 添加角色操作--》包括添加角色时授权
	 * @return
	 */
	@RequestMapping("user/roleAdd.do")
	public String roleAdd(Role role,Model model){
		model.addAttribute("message", "添加成功");
		roleService.insert(role);//添加角色，包含授权操作
		//System.out.println(role);
		return "user/role_main";
	}
}
