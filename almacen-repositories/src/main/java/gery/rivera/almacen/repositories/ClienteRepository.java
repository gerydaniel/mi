package gery.rivera.almacen.repositories;

import gery.rivera.almacen.model.Cliente;

public interface ClienteRepository 
	extends AlmacenRepository<Cliente> {

	Cliente findByCiNit(String ciNit);
	
}