package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.RespuestaDAO;
import com.damn1self.utp.encuesta_te.models.Respuesta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.service.RespuestaService;

public class RespuestaServiceImpl implements RespuestaService {

   private final RespuestaDAO dao;
    
    public RespuestaServiceImpl(RespuestaDAO dao){
        this.dao=dao;
    }

    @Override
    public List<Respuesta> listar() throws SQLException {
         return this.dao.listar();  
    }

    @Override
    public ArrayList<Respuesta> listarArreglo() throws SQLException {
        return this.dao.listarArreglo();
    }

    @Override
    public Respuesta listarPorCodigo(int codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Respuesta listarPorCodigo(String codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Respuesta listarPorPosicion(int posicion) throws SQLException {
      return this.dao.listarPorCodigo(posicion);
    }

    @Override
    public boolean crear(Respuesta modelo) throws SQLException {
        return this.dao.crear(modelo);
    }

    @Override
    public boolean modificar(Respuesta modelo) throws SQLException {
       return this.dao.modificar(modelo);   
    }

    @Override
    public boolean eliminarPorCodigo(int codigo) throws SQLException {
       return this.dao.eliminarPorCodigo(codigo);   
    }

    @Override
    public boolean desactivarPorCodigo(int codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public boolean eliminar(Respuesta modelo) throws SQLException {
        return this.dao.eliminar(modelo);
    }


  

    
}
