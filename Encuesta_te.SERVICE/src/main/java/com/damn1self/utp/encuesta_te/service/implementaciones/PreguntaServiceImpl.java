package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.PreguntaDAO;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import com.damn1self.utp.encuesta_te.service.PreguntaService;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public int crear(Pregunta modelo) throws SQLException {
        return this.dao.crear(modelo);
    }

    @Override
    public int modificar(Pregunta modelo) throws SQLException {
       return this.dao.modificar(modelo);   
    }

    @Override
    public int eliminarPorCodigo(int codigo) throws SQLException {
       return this.dao.eliminarPorCodigo(codigo);   
    }

    @Override
    public int desactivarPorCodigo(int codigo) throws SQLException {
       return this.dao.desactivarPorCodigo(codigo);
    }

    
}
