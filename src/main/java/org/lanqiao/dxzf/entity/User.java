package org.lanqiao.dxzf.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

/**
 * 用户实体类
 * @author PB
 *
 */
@SuppressWarnings("serial")
public class User implements Serializable{
	private Integer uid;		//用户id
	private String username;	//用户名
	private String password;	//登录密码
	private String uname;		//姓名
	private Date login_time;	//登入时间
	private Date exit_time;		//退出时间
	private Date menu_time;		//授权时间
	private List<Role> lr;		//角色集合
	private String roles;		//所有角色
	private List<Menu> lm;		//权限集合
	private String menus;		//所有权限
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Date getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}
	public Date getExit_time() {
		return exit_time;
	}
	public void setExit_time(Date exit_time) {
		this.exit_time = exit_time;
	}
	public Date getMenu_time() {
		return menu_time;
	}
	public void setMenu_time(Date menu_time) {
		this.menu_time = menu_time;
	}
	public List<Role> getLr() {
		return lr;
	}
	/**
	 * 通过注入lr将roles初始化
	 * @param lr
	 */
	public void setLr(List<Role> lr) {
		String roles = "";
		for(int i=0;i<lr.size();i++) {
			if(i==0) roles= lr.get(i).getRname();
			else roles += "、"+lr.get(i).getRname();
		}
		this.roles = roles;
		this.lr = lr;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public List<Menu> getLm() {
		return lm;
	}
	/**
	 * 通过注入lm将menus初始化
	 * @param lm
	 */
	public void setLm(List<Menu> lm) {
		String menus = "";
		for(int i=0;i<lm.size();i++) {
			if(i==0) menus= lm.get(i).getMname();
			else menus += "、"+lm.get(i).getMname();
		}
		this.menus = menus;

		this.lm = lm;
	}
	public String getMenus() {
		return menus;
	}
	public void setMenus(String menus) {
		this.menus = menus;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password="
				+ password + ", uname=" + uname + ", login_time=" + login_time
				+ ", exit_time=" + exit_time + ", menu_time=" + menu_time
				+ ", lr=" + lr + ", roles=" + roles + ", lm=" + lm + ", menus="
				+ menus + "]";
	}

}
