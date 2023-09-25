package com.jr.cliente.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.jr.cliente.Dao.Impl.IDaoCliente;
import com.jr.cliente.Entity.Clientes;

@RestController
@RequestMapping(value = ("/temporal"))

public class clienteController {

	@Autowired
	private IDaoCliente daoCliente;
	
	@GetMapping(value ="/mostrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Clientes> getCliente() {
	
	return daoCliente.findAll();
	
	
}
	
	@PostMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Clientes saveUsuario(@RequestBody Clientes clientes){
		
		return daoCliente.save(clientes);
	}
	
	@PutMapping(value = "/mostrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
public Clientes update(@RequestBody Clientes clientes) {
		return daoCliente.update(clientes);
	}
	
	
}
