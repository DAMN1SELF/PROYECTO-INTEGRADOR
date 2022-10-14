package com.damn1self.utp.encuesta_te.controlador;

import com.damn1self.utp.encuesta_te.dao.implementaciones.EncuestaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import com.damn1self.utp.encuesta_te.service.implementaciones.EncuestaServiceImpl;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import com.damn1self.utp.encuesta_te.service.EncuestaService;

/**
 *
 * @author DAMN
 */
public final class EncuestaControlador implements Serializable {

    
    private final EncuestaService service;
    private ArrayList<Encuesta> listaPerdurable;
    //private final EnumFormato formato;

    public EncuestaControlador() throws SQLException {
        this.listaPerdurable=new ArrayList<Encuesta>();
        //formato = EnumFormato.ArchivoPlano;//traer desde config
        service = new EncuestaServiceImpl(new EncuestaDAOImpl(  listaPerdurable ));
    
    }

    public ArrayList<Encuesta> listar() throws SQLException {
        listaPerdurable=service.listarArreglo();
        return listaPerdurable;
    }

    public void crear(Encuesta x) throws SQLException {
        service.crear(x);
    }

    public int obtenerCorrelativo() throws SQLException {
        return service.devolverCorrelativo();
    }

    public int obtenerLongitudArreglo() throws SQLException {
        return service.devolverTamanio();
    }

    
      public Encuesta obtenerPorCodigo(String codigo) throws SQLException {
        return service.listarPorCodigo(codigo);
    }

    public Encuesta obtenerPorCorrelativo(int correlativo) throws SQLException {
        return service.listarPorCodigo(correlativo);
    }

    public Encuesta obtenerPorPosicion(int posicion) throws SQLException {
        return service.listarPorPosicion(posicion);
    }
    
    public boolean modificar(Encuesta x) throws SQLException {
       return service.modificar(x);   
    }
   
    public boolean eliminar(Encuesta x ) throws SQLException {
       return service.eliminar(x);   
    }
}
