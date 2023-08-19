package com.jsp.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.demo.Entity.BankEntity;
@Repository
public interface BankRepository extends JpaRepository<BankEntity, Integer>
{

}
