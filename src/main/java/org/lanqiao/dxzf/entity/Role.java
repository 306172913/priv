package org.lanqiao.dxzf.entity;

import java.io.Serializable;
import java.util.List;
@SuppressWarnings("serial")
public class Role implements Serializable{
	private Integer rid;  	//角色id
	private String rname;	//角色名
	private String rinfo;	//角色信息
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
	public String getRinfo() {
		return rinfo;
	}
	public void setRinfo(String rinfo) {
		this.rinfo = rinfo;
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", lm=" + lm
				+ ", menus=" + menus + "]";
	}
}
