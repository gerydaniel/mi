package bo.gob.egpp.almacen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bo.gob.egpp.almacen.model.AlmacenModel;

public interface AlmacenRepository <T extends AlmacenModel> extends JpaRepository<T, Integer> {

}
