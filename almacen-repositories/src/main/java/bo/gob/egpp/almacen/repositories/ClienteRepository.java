package bo.gob.egpp.almacen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bo.gob.egpp.almacen.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
