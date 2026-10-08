package com.restorentInfo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restorentInfo.model.Restorent;
import com.restorentInfo.service.RestoService;

@RestController
@RequestMapping("/restoapi")
public class RestoController 
{
	@Autowired
	private RestoService restoservice;
	
	@GetMapping("/viewall")
	public List<Restorent> fetchAllResto()
	{
		return restoservice.getAllResto();
	}
	
	@GetMapping("/{id}")
	public Optional<Restorent> fetchRestoById(@PathVariable long id)
	{
		return Optional.ofNullable(restoservice.getrestoById(id).orElseThrow());
	}
	
	@PostMapping("/addresto")
	public Restorent save(@RequestBody Restorent r)
	{
		return restoservice.saveResto(r);
	}
	
	@PutMapping("/updateresto/{id}")
	public Restorent updateResto(@PathVariable long id, @RequestBody Restorent r)
	{
		Restorent restorent = restoservice.getrestoById(id).orElseThrow();
		
		restorent.setName(r.getName());
		restorent.setAddress(r.getAddress());
		restorent.setBest(r.getBest());
		restorent.setRating(r.getRating());
		
		return restoservice.saveResto(restorent);
		
	}
	
	@DeleteMapping("/deleteresto/{id}")
	public String deleteResto(@PathVariable long id)
	{
		restoservice.deleteRestoById(id);
		return "Delete Successfully!!";
	}
}
