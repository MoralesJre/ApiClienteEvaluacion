package com.jr.cliente.Dao.Impl;

import java.util.List;

import com.jr.cliente.Entity.Clientes;

public interface IDaoCliente {

	public List<Clientes> findAll();
	public Clientes save(Clientes clientes);
	public Clientes update(Clientes clientes);
}
