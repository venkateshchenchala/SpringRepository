package com.jsp.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsp.demo.Entity.BankEntity;
import com.jsp.demo.Entity.PersonEntity;
import com.jsp.demo.Repository.PersonRepository;

@Service
public class PersonService 
{
	@Autowired
private PersonRepository res;
	
	public PersonEntity saveperson(PersonEntity personEntity)
	{
		return res.save(personEntity);
	}
	public  List<PersonEntity> getAll()
	{
		return res.findAll();
	}
	public PersonEntity getBypersonid(int id)
	{
		return res.findById(id).orElse(new PersonEntity (HttpStatus.NOT_FOUND.value(),
				HttpStatus.NOT_FOUND.name(),HttpStatus.NOT_FOUND.name()));
	}
	public PersonEntity deleteperson(PersonEntity personEntity)
	{
		res.delete(personEntity);
		return personEntity;
	}

	
	
}
