package com.synergyj.cursos.webservices.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.synergyj.curso.web.services.BeanMonitoreo;
import com.synergyj.curso.web.services.ServicioMonitoreo;
import com.synergyj.curso.web.services.ServicioMonitoreoImpl;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/getMonitoreo")
public class DatosMonitoreo {

	/*
	 * creamos una intacica del servicio
	 */
	//para evitar que se instancie mas de una vez y genere daos extraños
	static private ServicioMonitoreo servicioMonitoreo = new ServicioMonitoreoImpl();
	
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    //cambiamos la salida a tipo json
    @Produces(MediaType.APPLICATION_JSON)
    public BeanMonitoreo getMonitoreo() {
        return servicioMonitoreo.regresaMonitoreo();
    }
}
