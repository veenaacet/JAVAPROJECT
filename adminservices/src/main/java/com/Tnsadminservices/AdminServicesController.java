package com.Tnsadminservices;

import javax.persistence.NoResultException;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AdminServicesController {
	@Autowired
	private AdminServices a;
	
	@GetMapping(("/AdminServices"))
	public List<Admin> list()
	{
		return a.listAll();
	}
	@GetMapping("/AdminServices/(ad_id)")
	public ResponseEntity<Admin> get (@PathVariable Integer ad_id)
	{
		try
		{
			Admin ad=a.get(ad_id);
			return new ResponseEntity<Admin>(ad,HttpStatus.OK);
		}
		catch(NoResultException e)
		{
			return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/AdminServices")
	public void add(@RequestBody Admin adm)
	{
		a.save(adm);
	}
	@PutMapping("/AdminServices/(ad_id)")
	public ResponseEntity<?> update(@RequestBody Admin adm,@PathVariable Integer ad_id)
	{
		Admin existadmin=a.get(ad_id);
		a.save(adm);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/AdminServices/(ad_id)")
	public void delete (@PathVariable Integer ad_id)
	{
		a.delete(ad_id);
	}

}
