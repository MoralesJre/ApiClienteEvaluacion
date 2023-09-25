package com.jr.cliente.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jr.cliente.Dao.Impl.IDaoCliente;
import com.jr.cliente.Entity.Clientes;


@Repository
@Transactional


public class DaoCliente implements IDaoCliente {

	@PersistenceContext
	private EntityManager em;

@Transactional (readOnly = true)
@Override
	public List<Clientes> findAll() {
		try {
			List<Clientes> listaClientes = em.createQuery("FROM Clientes", Clientes.class).getResultList();
			return listaClientes;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
}

@Override
public Clientes save(Clientes clientes) {
	try {
		em.persist(clientes);
		return clientes;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}

@Override
public Clientes update(Clientes clientes) {
	try {
		em.persist(clientes);
		return clientes;
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}


}
