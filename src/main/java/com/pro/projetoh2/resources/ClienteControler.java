package com.pro.projetoh2.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.pro.projetoh2.models.Cliente;
import com.pro.projetoh2.repository.ClienteRepository;

@RestController
@RequestMapping("/api")
public class ClienteControler {
	
	@Autowired //Ele vai adciona uma instancia pra gente
	private ClienteRepository clienteRepository;
	
	@GetMapping("/entrada/{input}")
	public String retornaVariavel(@PathVariable String input) {
		return input;
	}
	
	@GetMapping("/ola")
	public String HelloWord() {
		return "Hello Word";
	}
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
	@PostMapping("/cliente")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente addCliente(@RequestBody Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	@GetMapping("/cliente/{id}")
	public Cliente buscaId(@PathVariable long id) {
		 return clienteRepository.findById(id);
	}
	
}
