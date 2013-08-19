package com.jknyou.ucloud.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jknyou.ucloud.service.UcloudServerService;

@Controller
public class HomeController {
	@Inject private UcloudServerService ucloudServerService;
	
	@RequestMapping(value ={"/", "/home"}, method = RequestMethod.GET)
	public String home(ModelMap map) {
		return "home";
	}
}
