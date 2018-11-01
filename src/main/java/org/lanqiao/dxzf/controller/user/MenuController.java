package org.lanqiao.dxzf.controller.user;

import java.util.List;

import org.lanqiao.dxzf.entity.Menu;
import org.lanqiao.dxzf.entity.Role;
import org.lanqiao.dxzf.entity.UserTable;
import org.lanqiao.dxzf.service.user.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MenuController {
	@Autowired
	MenuService menuService;
	/**
	 * 权限主界面
	 * @return
	 */
	@RequestMapping("user/menu_main.do")
	public String menu_main(){
		return "user/menu_main";
	}
	/**
	 * 查询所有权限信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/findAllMenu.do")
	public UserTable findAllUser(){
		//查询列表数据
		List<Menu> listMenu = menuService.find(null);
		UserTable userTable = new UserTable();
		List<Object> data = userTable.getData();
		for(Menu menu:listMenu){
			data.add(menu);
			System.out.println(menu);
		}
		return userTable;
	}
	/**
	 * 添加权限界面
	 * @return
	 */
	@RequestMapping("user/menu_add.do")
	public String menu_add(){
		return "user/menu_add";
	}
	/**
	 * 添加权限
	 * @return
	 */
	@RequestMapping("user/menuAdd.do")
	public String menuAdd(Menu menu,Model mode){
		menuService.insert(menu);
		mode.addAttribute("message","添加成功");
		return "user/menu_add";
	}
}
