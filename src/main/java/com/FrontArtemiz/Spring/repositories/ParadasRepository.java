package com.FrontArtemiz.Spring.repositories;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.FrontArtemiz.Spring.models.Parada;

@Repository
public interface ParadasRepository extends CrudRepository<Parada,Integer> {
	
	/*
	 * @Transactional(readOnly = true) Optional<Parada> findBymaquina(String
	 * maquina);
	 */
}
