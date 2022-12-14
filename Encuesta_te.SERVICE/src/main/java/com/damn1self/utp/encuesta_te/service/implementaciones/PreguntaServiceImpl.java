package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.PreguntaDAO;
import com.damn1self.utp.encuesta_te.dao.implementaciones.PreguntaDAOImpl;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.service.PreguntaService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAMN
 */
public class PreguntaServiceImpl implements PreguntaService {

   private final PreguntaDAO dao;
    
    public PreguntaServiceImpl(PreguntaDAO dao){
        this.dao=dao;
    }

    @Override
    public List<Pregunta> listar() throws SQLException {
         return this.dao.listar();  
    }

    @Override
    public ArrayList<Pregunta> listarArreglo() throws SQLException {
        return this.dao.listarArreglo();
    }

    @Override
    public Pregunta listarPorCodigo(int codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Pregunta listarPorCodigo(String codigo) throws SQLException {
        return this.dao.listarPorCodigo(codigo);
    }
    @Override
    public Pregunta listarPorPosicion(int posicion) throws SQLException {
      return this.dao.listarPorCodigo(posicion);
    }

    @Override
    public boolean crear(Pregunta modelo) throws SQLException {
        return this.dao.crear(modelo);
    }

    @Override
    public boolean modificar(Pregunta modelo) throws SQLException {
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
    public boolean eliminar(Pregunta modelo) throws SQLException {
        return this.dao.eliminar(modelo);
    }


  

    
}
