package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.EncuestaDAO;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.service.EncuestaService;


public class EncuestaServiceImpl implements EncuestaService {

    private final EncuestaDAO dao;
    
    public EncuestaServiceImpl(EncuestaDAO dao){
        this.dao=dao;
    }
    
    @Override
    public List<Encuesta> listar() throws SQLException {
         return this.dao.listar();  
    }

    @Override
    public ArrayList<Encuesta> listarArreglo() throws SQLException {
        return this.dao.listarArreglo();
    }

    @Override
    public Encuesta listarPorCodigo(int codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
      @Override
    public Encuesta listarPorCodigo(String codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
     @Override
    public Encuesta listarPorPosicion(int posicion) throws SQLException {
       return this.dao.listarPorPosicion(posicion);
    }
    
    @Override
    public boolean crear(Encuesta modelo) throws SQLException {
        return this.dao.crear(modelo);
    }

    @Override
    public boolean modificar(Encuesta modelo) throws SQLException {
       return this.dao.modificar(modelo);   
    }

    @Override
    public boolean eliminarPorCodigo(int codigo) throws SQLException {
       return this.dao.eliminarPorCodigo(codigo);   
    }

    @Override
    public boolean desactivarPorCodigo(int codigo) throws SQLException {
       return this.dao.desactivarPorCodigo(codigo);
    }

    @Override
    public int devolverCorrelativo() throws SQLException {
         return this.dao.devolverCorrelativo();
    }

    @Override
    public int devolverTamanio() throws SQLException {
        return this.dao.devolverTamanio();
    }

    @Override
    public boolean eliminar(Encuesta modelo) throws SQLException {
        return this.dao.eliminar(modelo);
    }

 
 
  

}
