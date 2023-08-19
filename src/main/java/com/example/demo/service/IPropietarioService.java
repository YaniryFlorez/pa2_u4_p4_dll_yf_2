package com.example.demo.service;

import java.util.List;
import com.example.demo.repository.modelo.Propietario;
public interface IPropietarioService {

	public void ingresar(Propietario propietario); 

	public void modificar(Propietario propietario);

	public void borrar(Integer id);

	public Propietario seleccionarPorId(Integer id);

	public List<Propietario> buscarTodo();
}
