package com.idat.EC1JormanHuaman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EC1JormanHuaman.model.Cliente;

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Integer>{

}
