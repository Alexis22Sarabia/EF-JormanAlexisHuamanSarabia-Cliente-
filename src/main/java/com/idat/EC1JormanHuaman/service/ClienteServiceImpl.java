package com.idat.EC1JormanHuaman.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.EC1JormanHuaman.model.Cliente;
import com.idat.EC1JormanHuaman.repository.ClienteRepository;
@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Override
	public List<Cliente> listar() {
		
		
		return repository.findAll();
	}

	@Override
	public Cliente obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.save(null);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteAllById(null);
	}

	@Override
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(null);
	}

}
