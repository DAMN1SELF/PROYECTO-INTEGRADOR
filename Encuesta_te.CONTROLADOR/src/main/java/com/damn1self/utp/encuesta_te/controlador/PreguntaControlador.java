
package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.PreguntaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import com.damn1self.utp.encuesta_te.service.PreguntaService;
import com.damn1self.utp.encuesta_te.service.implementaciones.PreguntaServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.utils.EnumFormato;

/**
 *
 * @author DAMN
 */
public final class PreguntaControlador implements Serializable{

    private List<Pregunta> lista;
    private PreguntaService service;
    private EnumFormato formato;
            
    public PreguntaControlador() throws SQLException{
        formato=EnumFormato.ArchivoPlano;//traer desde config
        lista=new ArrayList<>();
        service= new PreguntaServiceImpl(new PreguntaDAOImpl(formato));
        listar();
    }

    public void listar() throws SQLException {
	this.lista = service.listar();
    }
    
    public void seleccionar(EnumFormato formato) throws SQLException {
	this.service = new PreguntaServiceImpl(new PreguntaDAOImpl(formato));
	listar();
    }

    public List<Pregunta> getLista() {
	return this.lista;
    }

    public void setLista(List<Pregunta> lista) {
	this.lista = lista;
    }	
    
}
