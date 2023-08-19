package com.jsp.demo.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="bank_account")
public class BankEntity implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private Integer id;
private String name;
private long Accountnumber;
@ManyToOne
@JoinColumn
private PersonEntity personEntity;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAccountnumber() {
	return Accountnumber;
}
public void setAccountnumber(long accountnumber) {
	this.Accountnumber = accountnumber;
}
public PersonEntity getPersonEntity() {
	return personEntity;
}
public void setPersonEntity(PersonEntity personEntity) {
	this.personEntity = personEntity;
}
@Override
public String toString() {
	return "BankEntity [id=" + id + ", name=" + name + ", Accountnumber=" + Accountnumber + ", personEntity="
			+ personEntity + "]";
}
public BankEntity() {}
public BankEntity(Integer id,String name,long Accountnumber,PersonEntity personEntity)
{
	super();
	this.id=id;
	this.name=name;
	this.Accountnumber=Accountnumber;
	this.personEntity=personEntity;
}

}
