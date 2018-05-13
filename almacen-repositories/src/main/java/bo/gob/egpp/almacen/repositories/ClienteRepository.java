package bo.gob.egpp.almacen.repositories;

import bo.gob.egpp.almacen.model.Cliente;

public interface ClienteRepository 
	extends AlmacenRepository<Cliente> {

	Cliente findByCiNit(String ciNit);
	
}