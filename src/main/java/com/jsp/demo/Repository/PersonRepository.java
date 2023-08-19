package com.jsp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.demo.Entity.PersonEntity;
@Repository
public interface PersonRepository extends JpaRepository<PersonEntity, Integer>
{





}