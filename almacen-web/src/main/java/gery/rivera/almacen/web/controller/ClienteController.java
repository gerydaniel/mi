package gery.rivera.almacen.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import gery.rivera.almacen.model.Cliente;
import gery.rivera.almacen.services.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@RequestMapping(method=RequestMethod.GET,produces={"application/xml", "application/json"})

	public List<Cliente> listar()
	{
		return clienteService.list();
		
	}
	@RequestMapping(value="/{id}",method=RequestMethod.GET,produces={"application/json"})
	public Cliente obtener(@PathVariable("id")Integer id)
	{
		return clienteService.get(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,produces={"application/xml", "application/json"})
	public Cliente agregar (@RequestBody Cliente cliente)
	{
		return clienteService.persist(cliente);
	}
	
	@RequestMapping(method=RequestMethod.PUT,produces={"application/xml", "application/json"})
	public Cliente actualizar(@RequestBody Cliente cliente)
	{
		return clienteService.persist(cliente);
	}
	@RequestMapping(value="/{id}",method=RequestMethod.DELETE,produces={"application/xml", "application/json"})
	public String eliminar (@PathVariable("id")Integer id)
	{
		clienteService.delete(id);
		return "Item eliminado"+id;
		
	}
	
	
	
}
