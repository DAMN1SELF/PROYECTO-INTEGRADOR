package com.damn1self.utp.encuesta_te.generico;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAMN
 * @param <T>
 */
public interface MantenimientoUnitario<T> {

    List<T> listar() throws SQLException;

    ArrayList<T> listarArreglo() throws SQLException;

    T listarPorCodigo(int codigo) throws SQLException;
    
    T listarPorCodigo(String codigo) throws SQLException;

    /**
     * 
     * @param posicion
     * @return
     * @throws SQLException 
     */
    T listarPorPosicion(int posicion) throws SQLException;

    boolean crear(T modelo) throws SQLException;

    boolean modificar(T modelo) throws SQLException;

    boolean eliminarPorCodigo(int codigo) throws SQLException;
    
    boolean eliminar(T modelo,String code) throws SQLException;//OK

    boolean desactivarPorCodigo(int codigo) throws SQLException;

    int devolverCorrelativo() throws SQLException;

    int devolverTamanio() throws SQLException;
}
