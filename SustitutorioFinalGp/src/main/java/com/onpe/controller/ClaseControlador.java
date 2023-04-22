package com.onpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.onpe.service.IInterfaceServicio;


@Configuration
@CrossOrigin
@Controller
public class ClaseControlador extends WebMvcAutoConfiguration{
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		
	}
	//LLAMADO DE LA PAGINA = COMO RESULTADO ONPE
	@Autowired
    private IInterfaceServicio iInterfaceServicio;	
@GetMapping ("/actas/numero/{id}") 
    public String listarnum(Model modelo,@PathVariable("id")String id) {
    	modelo.addAttribute("actas", iInterfaceServicio.getGrupoVotacion(id));
    	return "ActasPorNumero";
    	//FINALIZA :D
}
}
