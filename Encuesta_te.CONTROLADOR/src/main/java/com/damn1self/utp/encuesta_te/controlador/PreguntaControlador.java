package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.PreguntaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import com.damn1self.utp.encuesta_te.service.implementaciones.PreguntaServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import com.damn1self.utp.encuesta_te.service.PreguntaService;

/**
 *
 * @author DAMN
 */
public final class PreguntaControlador implements Serializable {

    
    private final PreguntaService service;
    private ArrayList<Pregunta> listaPerdurable;
    //private final EnumFormato formato;

    public PreguntaControlador() throws Exception {
        this.listaPerdurable=new ArrayList<Pregunta>();
        service = new PreguntaServiceImpl(new PreguntaDAOImpl(  listaPerdurable ));
    
    }


    public ArrayList<Pregunta> listar() throws SQLException {
        listaPerdurable=service.listarArreglo();
        return listaPerdurable;
    }

    public void crear(Pregunta x) throws SQLException {
        service.crear(x);
    }

    public int obtenerCorrelativo() throws SQLException {
        return service.devolverCorrelativo();
    }

    public int obtenerLongitudArreglo() throws SQLException {
        return service.devolverTamanio();
    }

    
      public Pregunta obtenerPorCodigo(String codigo) throws SQLException {
        return service.listarPorCodigo(codigo);
    }

    public Pregunta obtenerPorCorrelativo(int correlativo) throws SQLException {
        return service.listarPorCodigo(correlativo);
    }

    public Pregunta obtenerPorPosicion(int posicion) throws SQLException {
        return service.listarPorPosicion(posicion);
    }
    
    public boolean modificar(Pregunta x) throws SQLException {
       return service.modificar(x);   
    }
   
    public boolean eliminar(Pregunta x ) throws SQLException {
       return service.eliminar(x);   
    }
    
     public boolean eliminar(int x ) throws SQLException {
       return service.eliminarPorCodigo(x);   
    }
}
