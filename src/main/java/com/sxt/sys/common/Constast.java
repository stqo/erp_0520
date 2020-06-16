package com.sxt.sys.common;

import javax.print.attribute.standard.NumberUp;

public interface Constast {
	
	
	/**
	 * 状态码
	 * 
	 */
	public static final Integer OK=200;
	public static final Integer ERROR=-1;


	/**
	 * 菜单权限类型
	 */
	public static final String TYPE_MNEU = "menu";
	public static final String TYPE_PERMISSION = "permission";


	/**
	 * 可用状态
	 */
	public static final Object AVAILABLE_TYPE = 1;
	public static final Object AVAILABLE_FALSE = 0;


	/**
	 * 用户类型
	 * 根据是<超级管理员>还是<普通用户>决定菜单的多少
	 */
	public static final Object USER_TYPE_SUPER = 0;
	public static final Object USER_TYPE_NORMAL = 1;


	/**
	 *
	 */

	public static final Integer OPEN_TRUE = 0;
	public static final Integer OPEN_FALSE = 1;

}
