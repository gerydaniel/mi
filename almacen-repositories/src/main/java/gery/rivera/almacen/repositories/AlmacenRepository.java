package gery.rivera.almacen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gery.rivera.almacen.model.AlmacenModel;

public interface AlmacenRepository <T extends AlmacenModel> extends JpaRepository<T, Integer> {

}
