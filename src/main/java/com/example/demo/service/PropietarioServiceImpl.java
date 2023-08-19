package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioServiceImpl implements IPropietarioService{

	
	@Autowired

	private IPropietarioRepository propietarioRepository;
	
	@Transactional(value = TxType.REQUIRES_NEW)
	@Override
	public void ingresar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);
		
	}

	@Override
	public void modificar(Propietario propietario) {
		this.propietarioRepository.actualizar(propietario);		
	}

	@Override
	public void borrar(Integer id) {
		this.propietarioRepository.eliminar(id);		
	}

	@Override
	public Propietario seleccionarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.propietarioRepository.seleccionarPorId(id);
	}

	@Override
	public List<Propietario> buscarTodo() {
		// TODO Auto-generated method st
		return this.propietarioRepository.buscarTodo();
	}
	
}
