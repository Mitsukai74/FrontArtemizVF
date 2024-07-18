package com.FrontArtemiz.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.FrontArtemiz.Spring.models.Parada;


public interface IParadasService{
	List<Parada> findAll();
	Optional<Parada> findBycausal(String desc_causal);
	void saveAll(List<Parada> Parada);
}
