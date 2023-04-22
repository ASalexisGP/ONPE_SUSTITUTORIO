package com.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ClaseModelo {

@Id

private int idLocalVotacion;
private String Departamento;
private String Provincia;
private String Distrito;
private String RazonSocial;
private String Direccion;
public int getIdLocalVotacion() {
	return idLocalVotacion;
}
public void setIdLocalVotacion(int idLocalVotacion) {
	this.idLocalVotacion = idLocalVotacion;
}
public String getDepartamento() {
	return Departamento;
}
public void setDepartamento(String departamento) {
	Departamento = departamento;
}
public String getProvincia() {
	return Provincia;
}
public void setProvincia(String provincia) {
	Provincia = provincia;
}
public String getDistrito() {
	return Distrito;
}
public void setDistrito(String distrito) {
	Distrito = distrito;
}
public String getRazonSocial() {
	return RazonSocial;
}
public void setRazonSocial(String razonSocial) {
	RazonSocial = razonSocial;
}
public String getDireccion() {
	return Direccion;
}
public void setDireccion(String direccion) {
	Direccion = direccion;
}
}
