package com.amjad.sboot.reposi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amjad.sboot.entity.ApiEntity;

@Repository
public interface ApiReposi extends JpaRepository<ApiEntity, Integer>
{
	
}
