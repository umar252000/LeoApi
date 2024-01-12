package com.amjad.sboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amjad.sboot.entity.ApiEntity;
import com.amjad.sboot.reposi.ApiReposi;

@Service
public class ApiServiceLayer 
{
	@Autowired
	ApiReposi d1;
	public ApiEntity save(ApiEntity ai)
	{
		ApiEntity save = d1.save(ai);
		return save;
		
	}
	
	public List<ApiEntity> all()
	{
		
		List<ApiEntity> findAll = d1.findAll();
		return findAll;
		
	}
	
	public Optional<ApiEntity> id(int id)
	{
		Optional<ApiEntity> findById = d1.findById(id);
		return findById;
	}
	
	
	
	
	
}
