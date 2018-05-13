package gery.rivera.almacen.repositories;

import gery.rivera.almacen.model.Usuario;

public interface UsuarioRepository extends AlmacenRepository<Usuario> {

	Usuario findByLogin(String login);
	
}