package bo.gob.egpp.almacen.repositories;

import bo.gob.egpp.almacen.model.Usuario;

public interface UsuarioRepository extends AlmacenRepository<Usuario> {

	Usuario findByLogin(String login);
	
}