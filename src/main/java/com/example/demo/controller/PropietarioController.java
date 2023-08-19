package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.repository.modelo.Propietario;
import com.example.demo.service.IPropietarioService;
@Controller
@RequestMapping("/propietarios")
public class PropietarioController {

	@Autowired
	private IPropietarioService propietarioService;

	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		List<Propietario> lista = this.propietarioService.buscarTodo();
		modelo.addAttribute("propietarios", lista);
		return "vistaListaPropietarios";
	}
	//http://localhost:8080/concecionario/propietario/buscarPorID/
	@GetMapping("/buscarPorID/{idPropietario}")
	public String buscarPorId(@PathVariable("IdPropietario") Integer id, Model model) {
		Propietario prop= this.propietarioService.seleccionarPorId(id);
		model.addAttribute("propietario", prop);
		return "vistaPropirtario";
	}
	//http://localhost:8080/concecionario/propietario/actualizar/

	@PutMapping("/actualizar/{idPropietario}")
	public String actualizarPropietario(@PathVariable("IdPropietario")Integer id, Propietario propietario) {
		this.propietarioService.modificar(propietario);
		return "redirect:/propietarios/buscar";
	}
}
