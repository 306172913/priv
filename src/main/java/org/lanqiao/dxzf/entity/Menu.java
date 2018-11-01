package org.lanqiao.dxzf.entity;

import java.io.Serializable;
@SuppressWarnings("serial")
public class Menu implements Serializable{
	private Integer mid;	//权限id
	private String mname;	//权限名
	private String minfo;  	//权限信息
	public Menu() {
		super();
	}

	public Menu(Integer mid, String mname) {
		super();
		this.mid = mid;
		this.mname = mname;
	}
	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getMinfo() {
		return minfo;
	}

	public void setMinfo(String minfo) {
		this.minfo = minfo;
	}

	@Override
	public String toString() {
		return "Menu [mid=" + mid + ", mname=" + mname + "]";
	}

}
