package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.IPropietarioService;

@SpringBootApplication
public class Pa2U4P4DllYf2Application implements CommandLineRunner{

	@Autowired
	private IPropietarioService propietarioService;
	
	public static final Logger LOG = LoggerFactory.getLogger(Pa2U4P4DllYf2Application.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U4P4DllYf2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//http://localhost:8080/concesionario/propietarios/buscar
		Propietario prop = new Propietario();
		prop.setNombre("Juan");
		prop.setApellido("Angulo");
		prop.setCedula("010");

		this.propietarioService.ingresar(prop);

		Propietario prop2 = new Propietario();
		prop2.setNombre("Angel");
		prop2.setApellido("Perez");
		prop2.setCedula("020");

		this.propietarioService.ingresar(prop2);
	}
	

}
