package com.FrontArtemiz.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.FrontArtemiz.Spring.models.Parada;
import com.FrontArtemiz.Spring.repositories.ParadasRepository;

@Service
public class ParadasServiceImple implements IParadasService {
	@Autowired
	private ParadasRepository paradasrepository;
	
	@Override
	public List<Parada> findAll() {
		// TODO Auto-generated method stub
		return (List<Parada>) paradasrepository.findAll();
	}	

	@Override
	public void saveAll(List<Parada> Parada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Parada> findBycausal(String desc_causal) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

}
