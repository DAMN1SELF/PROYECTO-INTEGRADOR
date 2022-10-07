
package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.EncuestaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import com.damn1self.utp.encuesta_te.service.implementaciones.EncuestaServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.utils.EnumFormato;
import com.damn1self.utp.encuesta_te.service.EncuestaService;

/**
 *
 * @author DAMN
 */
public final class EncuestaControlador implements Serializable{

    private List<Encuesta> lista;
    private EncuestaService service;
    private EnumFormato formato;
            
    public EncuestaControlador() throws SQLException{
        formato=EnumFormato.ArchivoPlano;//traer desde config
        lista=new ArrayList<>();
        service= new EncuestaServiceImpl(new EncuestaDAOImpl());
        listar();
    }

    public void listar() throws SQLException {
	this.lista = service.listarArreglo();
    }
    
    public void crear(Encuesta x) throws  SQLException{
        service.crear(x);
    }
    
    public int obtenerCorrelativo() throws  SQLException{
       return service.devolverCorrelativo();
    }


}
