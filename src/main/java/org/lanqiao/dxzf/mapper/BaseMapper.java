package org.lanqiao.dxzf.mapper;

import java.io.Serializable;
import java.util.List;
/**
 * 泛型接口
 * @author PB
 *
 * @param <T>
 */
public interface BaseMapper<T>{
	public List<T> find(T entity);
	public T get(Serializable id);
	public int insert(T entity);
	public int update(T entity);
	public int delete(Serializable id);
	public int delete(Serializable[] ids);
}
