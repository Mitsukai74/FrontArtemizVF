package com.FrontArtemiz.Spring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.FrontArtemiz.Spring.models.Parada;

@Service
public interface IParadasService{
	List<Parada> findAll();
	Optional<Parada> findBymaquina(String maquina);
	void saveAll(List<Parada> Parada);
}
