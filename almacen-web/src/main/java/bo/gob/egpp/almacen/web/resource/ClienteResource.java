package bo.gob.egpp.almacen.web.resource;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import bo.gob.egpp.almacen.model.Cliente;
import bo.gob.egpp.almacen.services.ClienteService;

@Path("cliente")
public class ClienteResource {
	@Autowired
	ClienteService clienteService;
	
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Cliente> listar()
	{
		return clienteService.list();
		
	}
	@GET
	@Produces({MediaType.APPLICATION_JSON})
	@Path("/{id}")
	public Cliente obtener(@PathParam("id")Integer id)
	{
		return clienteService.get(id);
		
	}
	@POST
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Cliente agregar (Cliente cliente)
	{
		return clienteService.persist(cliente);
	}
	
	@PUT
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Cliente actualizar(Cliente cliente)
	{
		return clienteService.persist(cliente);
	}
	@DELETE
	@Path("/{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public String eliminar (@PathParam("id")Integer id)
	{
		clienteService.delete(id);
		return "Item eliminado"+id;
		
	}
	
	
	
}
