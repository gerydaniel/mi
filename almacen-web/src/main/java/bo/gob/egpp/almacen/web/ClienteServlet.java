package bo.gob.egpp.almacen.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import bo.gob.egpp.almacen.model.Cliente;
import bo.gob.egpp.almacen.services.ClienteService;

/**
 * Servlet implementation class ClienteServlet
 */
public class ClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Autowired
	ClienteService clienteService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClienteServlet() {
        super();
         // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
 			String operacion = request.getParameter("op");
 			if(operacion == null) {
 				response.getWriter().append("Debe indicar en el QueryString el tipo de operación (CRUD) y los otros atributos de ser necesarios").append("<br />");
 				response.getWriter().append("Ejemplo de listado: ?op=R<br />");
 				response.getWriter().append("Ejemplo de creacion: ?op=C&cinit=ValorDelNit&razonsocial=ValorRazonSocial<br />");
 				response.getWriter().append("Ejemplo de actualización: ?op=U&cinit=NuevoValorDelNit&razonsocial=NuevoValorRazonSocial&id=IdAActualizar<br />");
 				response.getWriter().append("Ejemplo de borrado: ?op=D&id=IdAEliminar<br />");
 				return;
 			}
 			
 			WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext()). getAutowireCapableBeanFactory().autowireBean(this);
 			
 			StringBuilder str = new StringBuilder();
 			if("R".equals(operacion)) {
 				List<Cliente> clientes = clienteService.list();
 				str.append("<table border=\"1\"><tr><th>ID</th><th>CI</th><th>Nombres</th></tr>");
 				for(Cliente cliente: clientes) {
 					str.append("<tr><td>")
 					.append(cliente.getId())
 					.append("</td><td>")
 					.append(cliente.getCiNit())
 					.append("</td><td>")
 					.append(cliente.getRazonSocial())
 					.append("</td></tr>");
 				}				
 				str.append("</table>");
 			}
 			if("C".equals(operacion)) {
 				String ciNit = request.getParameter("cinit");
 				String razonSocial = request.getParameter("razonsocial");
 				Cliente cliente = new Cliente();
 				cliente.setCiNit(ciNit);
 				cliente.setRazonSocial(razonSocial);
 				cliente = clienteService.persist(cliente);
 				str.append("Cliente agregado correctamente con el ID: " + cliente.getId());
 			}
 			if("U".equals(operacion)) {
 				String ciNit = request.getParameter("cinit");
 				String razonSocial = request.getParameter("razonsocial");
 				String id = request.getParameter("id");
 				Cliente cliente = new Cliente();
 				cliente.setCiNit(ciNit);
 				cliente.setRazonSocial(razonSocial);
 				cliente.setId(Integer.parseInt(id));
 				cliente = clienteService.persist(cliente);
 				str.append("Cliente actualizado correctamente con el ID: " + cliente.getId());
 			}
 			if("D".equals(operacion)) {
 				String id = request.getParameter("id");
 				clienteService.delete(Integer.parseInt(id));
 				str.append("Cliente eliminado correctamente");
 			}
 			response.getWriter().append(str.toString());
		}
		catch(Exception e) {
			response.getWriter().append("Error: " + e.getMessage());
			e.printStackTrace(response.getWriter());
			
		}
		
	}	*/
}
