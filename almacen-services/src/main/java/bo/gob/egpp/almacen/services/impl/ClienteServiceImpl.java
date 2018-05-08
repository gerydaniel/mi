package bo.gob.egpp.almacen.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bo.gob.egpp.almacen.model.Cliente;
import bo.gob.egpp.almacen.repositories.ClienteRepository;
import bo.gob.egpp.almacen.services.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	

	public Cliente get(Integer id) {
		
		return clienteRepository.findOne(id);
		
	}

	public List<Cliente> list() {
		
		return clienteRepository.findAll();
	}

		@Transactional
	public void delete(Integer id) {
		clienteRepository.delete(id);
		
	}
		@Transactional
	public Cliente persist(Cliente cliente) {
			if (cliente.getId()!= null) {
				//consulta si el ci actual para comparacion 
				
			}
		return clienteRepository.saveAndFlush(cliente);
	}

}
