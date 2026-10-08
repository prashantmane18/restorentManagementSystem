package com.restorentInfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restorentInfo.model.Restorent;
import com.restorentInfo.repository.RestoRepository;

@Service
public class RestoService 
{
	@Autowired
	private RestoRepository restorepository;
	
	
	public List<Restorent> getAllResto()
	{
		return restorepository.findAll();
	}
	
	public Optional<Restorent> getrestoById(long id)
	{
		return restorepository.findById(id);
	}
	
	public Restorent saveResto(Restorent resto)
	{
		return restorepository.save(resto);
	}
	
	public void deleteRestoById(long id)
	{
		restorepository.deleteById(id);
	}
}
