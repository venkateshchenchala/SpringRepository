package com.jsp.demo.Entity;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

import java.util.*;
@Entity
@Table(name="person_info")
@Data
public class PersonEntity implements Serializable
{	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;
private String name;
private String email;
@OneToMany(cascade =CascadeType.ALL,mappedBy = "personEntity")
private List<BankEntity>account;


public PersonEntity() {}
public PersonEntity(Integer id,String name,String email)
{
	super();
	this.id=id;
	this.name=name;
	this.email=email;
}
}
