package com.damn1self.utp.encuesta_te.service.implementaciones;

import com.damn1self.utp.encuesta_te.dao.EncuestaDAO;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.service.EncuestaService;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAMN
 */
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

}
