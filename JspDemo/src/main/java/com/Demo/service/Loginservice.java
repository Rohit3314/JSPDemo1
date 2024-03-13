package com.Demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Demo.model.Loginmodel;
import com.Demo.repository.Logininterface;

@Service
public class Loginservice 
{
     
	@Autowired
	private Logininterface linterface;
	
	public Loginmodel saverecord(Loginmodel lm)
	{
		return linterface.save(lm);
		
	}
	
	public List<Loginmodel> fetch()
	{
		return linterface.findAll();
	}
	
	public void deleterecord()
	{
		linterface.deleteAll();
	}
}
