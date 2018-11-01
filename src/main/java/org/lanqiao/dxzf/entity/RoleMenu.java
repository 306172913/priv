package org.lanqiao.dxzf.entity;
/**
 * 中间表处理实体类
 * @author dell
 *
 */
public class RoleMenu {
	private Integer r_mid;
	private Integer rid;
	private Integer mid;

	public RoleMenu() {
		super();
	}
	public RoleMenu(Integer r_mid, Integer rid, Integer mid) {
		super();
		this.r_mid = r_mid;
		this.rid = rid;
		this.mid = mid;
	}
	public Integer getR_mid() {
		return r_mid;
	}
	public void setR_mid(Integer r_mid) {
		this.r_mid = r_mid;
	}
	public Integer getRid() {
		return rid;
	}
	public void setRid(Integer rid) {
		this.rid = rid;
	}
	public Integer getMid() {
		return mid;
	}
	public void setMid(Integer mid) {
		this.mid = mid;
	}
	@Override
	public String toString() {
		return "RoleMenu [r_mid=" + r_mid + ", rid=" + rid + ", mid=" + mid
				+ "]";
	}

}
