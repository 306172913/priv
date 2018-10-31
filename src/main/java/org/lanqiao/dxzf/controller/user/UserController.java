package org.lanqiao.dxzf.controller.user;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.lanqiao.dxzf.entity.User;
import org.lanqiao.dxzf.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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
	public List<User> findAllUser(){
		List<User> listUser = userService.find(null);
		return listUser;
	}
	/**
	 * 用户登录
	 */
	@RequestMapping("/user/userLogin.do")
	public String userLogin(User user,Model model,HttpSession session,HttpServletResponse response){
		System.out.println(user);
		User loginUser = userService.login(user);
		if(session.getAttribute("userName")!= null){
			return "user/index";
		}
		if(loginUser!=null){
			session.setAttribute("userName", loginUser.getUname());
			return "user/index";
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
}
