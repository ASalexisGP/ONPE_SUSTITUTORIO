package com.onpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onpe.model.ClaseModelo;
import com.onpe.repository.IInterfaceModelo;

@Service
public class ClaseServicio implements IInterfaceServicio{
@Autowired 
IInterfaceModelo iInterfaceModelo;
@Override 
public ClaseModelo getGrupoVotacion (String id) {
	
	return iInterfaceModelo.getGrupoVotacion(id);
}

}
