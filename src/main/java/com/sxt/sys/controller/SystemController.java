package com.sxt.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 负责跳转的类所有超链接经过这里跳转
 */
@Controller
@RequestMapping("sys")
public class SystemController {
	
	/**
	 * 跳转到登陆页面
	 */
	@RequestMapping("toLogin")
	public String toLogin() {
		return "system/index/login";
	}
	
	/**
	 * 跳转到首页
	 */
	@RequestMapping("index")
	public String index() {
		return "system/index/index";
	}


	/**
	 * 条状到工作太
	 */
	@RequestMapping("toDeskManager")
	public String toDeskManager(){
		return "system/index/deskManager";
	}


	/**
	 * 跳转到日志管理
	 */
	@RequestMapping("toLoginfoManager")
	public String toLoginfoManager(){
		return "system/loginfo/loginfoManager";
	}


}
