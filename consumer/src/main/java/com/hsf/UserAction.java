package com.hsf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hsf.itemcenter.User;
import com.hsf.itemcenter.UserService;


@Controller
@RequestMapping("/user")
public class UserAction {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/test")
	@ResponseBody
	public String  test(){
		System.out.println("1");
		return "1";
	}
	
	@RequestMapping("/select")
	@ResponseBody
	public String select(@RequestParam("id") String id){
		return userService.selectById(id).toString();
	}
	
}
