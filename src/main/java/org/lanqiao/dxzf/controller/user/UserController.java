package org.lanqiao.dxzf.controller.user;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.lanqiao.dxzf.entity.User;
import org.lanqiao.dxzf.entity.UserTable;
import org.lanqiao.dxzf.service.user.UserService;
import org.lanqiao.dxzf.util.Layui;
import org.lanqiao.dxzf.util.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@Autowired
	UserService userService;
	/**
	 * 查询所有用户信息
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/findAllUser.do")
	public UserTable findAllUser(){
		//查询列表数据
		List<User> listUser = userService.find(null);
/*		int total = userService.count();
		System.out.println(total);*/
		UserTable userTable = new UserTable();
		List<Object> data = userTable.getData();
		for(User user:listUser){
			data.add(user);
			System.out.println(user);
		}
		return userTable;
	}
	/**
	 * 用户登录
	 */
	@RequestMapping("/user/userLogin.do")
	public String userLogin(User user,Model model,HttpSession session,HttpServletResponse response){
		System.out.println(user);
		User loginUser = userService.login(user);
		if(session.getAttribute("userName")!= null){
			return "user/user_main";
		}
		if(loginUser!=null){
			session.setAttribute("userName", loginUser.getUname());
			return "user/user_main";
		}else{
			model.addAttribute("message", "用户名或密码输入错误！！！");
			return "login";
		}
	}
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/user/userReg.do")
	public User userReg(User user){
		userService.insert(user);
		return user;
	}
	/**
	 * 用户所有信息主界面
	 */
	@RequestMapping("/user/user_main")
	public String user_main(){
		return "user/user_main";
	}
}
