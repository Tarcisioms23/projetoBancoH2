package com.pro.projetoh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pro.projetoh2.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	 Cliente findById(long id);
}
