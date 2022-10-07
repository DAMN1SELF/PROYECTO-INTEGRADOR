package com.damn1self.utp.encuesta_te.generico;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAMN
 * @param <T>
 */

public interface Mantenimiento<T> {
    List<T> listar() throws SQLException;
    ArrayList<T> listarArreglo() throws SQLException;
    T listarPorCodigo(int codigo) throws SQLException;
    int crear(T modelo) throws SQLException;
    int modificar(T modelo) throws SQLException;
    int eliminarPorCodigo(int codigo) throws SQLException;
    int desactivarPorCodigo(int codigo)throws SQLException;
}
