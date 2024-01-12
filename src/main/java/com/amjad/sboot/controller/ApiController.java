package com.amjad.sboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amjad.sboot.entity.ApiEntity;
import com.amjad.sboot.service.ApiServiceLayer;

@RestController
public class ApiController 
{
	@Autowired
	ApiServiceLayer req;
	@PostMapping("/abc")
	public ApiEntity sum(@RequestBody ApiEntity api)  
  	
	
	{
		ApiEntity save2 = req.save(api);
		return save2;
		
	}
	@GetMapping("/xyz")
	public List<ApiEntity> sum2() 
	{
		List<ApiEntity> all = req.all();
		return all;
		
	}
	
	@GetMapping("d/{id}")
	public Optional<ApiEntity> getid(@PathVariable("id")int id)
	{
		Optional<ApiEntity> id2 = req.id(id);
		return id2;
	}
	
}

