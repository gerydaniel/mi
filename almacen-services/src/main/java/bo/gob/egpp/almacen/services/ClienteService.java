package bo.gob.egpp.almacen.services;

import java.util.List;

import bo.gob.egpp.almacen.model.Cliente;

public interface ClienteService {

	Cliente get(Integer id);
	List<Cliente> list();
	void delete(Integer id);
	Cliente persist(Cliente cliente);
	
}
