package org.lanqiao.dxzf.entity;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class Role implements Serializable{
	private Integer rid;  	//角色id
	private String rname;	//角色名
	private List<Menu> lm;	//权限集合
	private String menus;	//所有权限
	public Role() {
		super();
	}
	public Role(Integer rid, String rname, List<Menu> lm, String menus) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.lm = lm;
		this.menus = menus;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public List<Menu> getLm() {
		return lm;
	}
	public void setLm(List<Menu> lm) {
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
		return "Role [rid=" + rid + ", rname=" + rname + ", lm=" + lm
				+ ", menus=" + menus + "]";
	}
}
