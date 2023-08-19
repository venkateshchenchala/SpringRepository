package com.jsp.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.demo.Entity.BankEntity;
import com.jsp.demo.Entity.PersonEntity;
import com.jsp.demo.Service.PersonService;

@RestController
public class PersonRestController 
{
	@Autowired
	private PersonService per;
	
	@PostMapping("/saveperson")
	public @ResponseBody PersonEntity saveperson(@RequestBody PersonEntity personEntity)
	{
		return per.saveperson(personEntity);
	}
	@GetMapping("/getAll")
	public @ResponseBody List<PersonEntity> getAll()
	{
		return per.getAll();
	}
	@GetMapping("/getBypersonid/{id}")
	public PersonEntity getBypersonid(@PathVariable("id")int id)
	{
		return per.getBypersonid(id);
	}
	@GetMapping("/deleteperson/{id}")
	public PersonEntity deleteperson(@PathVariable("id")PersonEntity personEntity)
	{
		return per.deleteperson(personEntity);
	}
}
