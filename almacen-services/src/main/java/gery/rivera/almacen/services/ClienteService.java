package gery.rivera.almacen.services;

import java.util.List;

import gery.rivera.almacen.model.Cliente;

public interface ClienteService {

	Cliente get(Integer id);
	List<Cliente> list();
	void delete(Integer id);
	Cliente persist(Cliente cliente);
	
}
