package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.OpcionDAOImpl;
import com.damn1self.utp.encuesta_te.models.Opcion;
import com.damn1self.utp.encuesta_te.service.implementaciones.OpcionServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import com.damn1self.utp.encuesta_te.service.OpcionService;

/**
 *
 * @author DAMN
 */
public final class OpcionControlador implements Serializable {

    
    private final OpcionService service;
    private ArrayList<Opcion> listaPerdurable;
    //private final EnumFormato formato;

    public OpcionControlador(String code) throws SQLException, Exception {
        this.listaPerdurable=new ArrayList<Opcion>();
        service = new OpcionServiceImpl(new OpcionDAOImpl(  listaPerdurable ,code));
    
    }

    public ArrayList<Opcion> listar() throws SQLException {
        listaPerdurable=service.listarArreglo();
        return listaPerdurable;
    }

    public void crear(Opcion x) throws SQLException {
        service.crear(x);
    }

    public int obtenerCorrelativo() throws SQLException {
        return service.devolverCorrelativo();
    }

    public int obtenerLongitudArreglo() throws SQLException {
        return service.devolverTamanio();
    }

    
      public Opcion obtenerPorCodigo(String codigo) throws SQLException {
        return service.listarPorCodigo(codigo);
    }

    public Opcion obtenerPorCorrelativo(int correlativo) throws SQLException {
        return service.listarPorCodigo(correlativo);
    }

    public Opcion obtenerPorPosicion(int posicion) throws SQLException {
        return service.listarPorPosicion(posicion);
    }
    
    public boolean modificar(Opcion x) throws SQLException {
       return service.modificar(x);   
    }
   
    public boolean eliminar(Opcion x ) throws SQLException {
       return service.eliminar(x);   
    }
}
