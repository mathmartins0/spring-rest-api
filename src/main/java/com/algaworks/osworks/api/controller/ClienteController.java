package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar(){

		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Matheus");
		cliente1.setTelefone("12 98142-7074");
		cliente1.setEmail("matheus@gmail.com");


		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Tatiana");
		cliente2.setTelefone("12 99741-3253");
		cliente2.setEmail("tatiana@gmail.com");

		return Arrays.asList(cliente1, cliente2);
	}
}
