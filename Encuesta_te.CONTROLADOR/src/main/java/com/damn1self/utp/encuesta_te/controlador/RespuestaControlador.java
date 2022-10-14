package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.RespuestaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Respuesta;
import com.damn1self.utp.encuesta_te.service.implementaciones.RespuestaServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import com.damn1self.utp.encuesta_te.service.RespuestaService;

/**
 *
 * @author DAMN
 */
public final class RespuestaControlador implements Serializable {

    
    private final RespuestaService service;
    private ArrayList<Respuesta> listaPerdurable;
    //private final EnumFormato formato;

    public RespuestaControlador(String code) throws SQLException, Exception {
        this.listaPerdurable=new ArrayList<Respuesta>();
        service = new RespuestaServiceImpl(new RespuestaDAOImpl(  listaPerdurable ,code));
    
    }

    public ArrayList<Respuesta> listar() throws SQLException {
        listaPerdurable=service.listarArreglo();
        return listaPerdurable;
    }

    public void crear(Respuesta x) throws SQLException {
        service.crear(x);
    }

    public int obtenerCorrelativo() throws SQLException {
        return service.devolverCorrelativo();
    }

    public int obtenerLongitudArreglo() throws SQLException {
        return service.devolverTamanio();
    }

    
      public Respuesta obtenerPorCodigo(String codigo) throws SQLException {
        return service.listarPorCodigo(codigo);
    }

    public Respuesta obtenerPorCorrelativo(int correlativo) throws SQLException {
        return service.listarPorCodigo(correlativo);
    }

    public Respuesta obtenerPorPosicion(int posicion) throws SQLException {
        return service.listarPorPosicion(posicion);
    }
    
    public boolean modificar(Respuesta x) throws SQLException {
       return service.modificar(x);   
    }
   
    public boolean eliminar(Respuesta x ) throws SQLException {
       return service.eliminar(x);   
    }
}
