package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.OpcionDAO;
import com.damn1self.utp.encuesta_te.models.Opcion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.service.OpcionService;

public class OpcionServiceImpl implements OpcionService {

   private final OpcionDAO dao;
    
    public OpcionServiceImpl(OpcionDAO dao){
        this.dao=dao;
    }

    @Override
    public List<Opcion> listar() throws SQLException {
         return this.dao.listar();  
    }

    @Override
    public ArrayList<Opcion> listarArreglo() throws SQLException {
        return this.dao.listarArreglo();
    }

    @Override
    public Opcion listarPorCodigo(int codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Opcion listarPorCodigo(String codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Opcion listarPorPosicion(int posicion) throws SQLException {
      return this.dao.listarPorCodigo(posicion);
    }

    @Override
    public boolean crear(Opcion modelo) throws SQLException {
        return this.dao.crear(modelo);
    }

    @Override
    public boolean modificar(Opcion modelo) throws SQLException {
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
    public boolean eliminar(Opcion modelo) throws SQLException {
        return this.dao.eliminar(modelo);
    }


  

    
}
