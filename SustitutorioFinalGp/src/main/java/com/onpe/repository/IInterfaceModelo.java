package com.onpe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.onpe.model.ClaseModelo;

@Repository
public interface IInterfaceModelo extends JpaRepository<ClaseModelo, String>{
@Query (value = "{call usp_getGrupoVotacion(:id)}", nativeQuery = true)
ClaseModelo getGrupoVotacion(String id);

}
