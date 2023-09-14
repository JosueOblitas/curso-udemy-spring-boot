package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("MiServicioComplejo")
@Primary
public class MiServicioComplejo implements IServicio{
	
	@Override
	public String operacion() {
		return "ejecutano algun rpoceso importante y complicado";
	}
	
}