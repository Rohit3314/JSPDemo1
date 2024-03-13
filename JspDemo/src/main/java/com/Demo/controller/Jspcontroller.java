package com.Demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.Demo.model.Loginmodel;
import com.Demo.service.Loginservice;

@Controller
public class Jspcontroller
{

	@Autowired
	private Loginservice lservice;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	@RequestMapping("/add")
	public String add()
	{
		return "add";
	}
	@PostMapping(value="/register")
	public Loginmodel savedata(Loginmodel lm1)
	{
		return lservice.saverecord(lm1);
	}
	
	@RequestMapping("/delete")
	public String delete()
	{
		return "delete";
	}
	
	@PostMapping(value="/deletedata")
	public void  deletedata()
	{
		lservice.deleterecord();
	}
}
