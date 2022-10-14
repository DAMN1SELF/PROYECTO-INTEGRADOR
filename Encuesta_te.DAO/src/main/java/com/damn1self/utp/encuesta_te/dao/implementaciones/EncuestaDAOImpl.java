package com.damn1self.utp.encuesta_te.dao.implementaciones;

import com.damn1self.utp.encuesta_te.arreglo.EncuestaArreglo;
import com.damn1self.utp.encuesta_te.dao.EncuestaDAO;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DAMN
 */
public class EncuestaDAOImpl implements EncuestaDAO {


    private final ArrayList<Encuesta> lista;
    private final EncuestaArreglo arreglo;
    
    public EncuestaDAOImpl( ArrayList<Encuesta> lst) {
        lista=lst;
       arreglo=new EncuestaArreglo(lista);
    }

    
    @Override
    public ArrayList<Encuesta> listarArreglo() throws SQLException {
        return arreglo.lista;
    }
    
    @Override
    public Encuesta listarPorCodigo(int correlativo) throws SQLException {
        return arreglo.buscar(correlativo);
    }
    
    @Override
    public Encuesta listarPorCodigo(String codigo) throws SQLException {
        return arreglo.buscar(codigo);
    }
    
    @Override
    public Encuesta listarPorPosicion(int posicion) throws SQLException {
        return arreglo.obtener(posicion);
    }
    
    @Override
    public boolean crear(Encuesta modelo) throws SQLException {
        arreglo.adicionar(modelo);
        return true;
    }
    
    @Override
    public boolean modificar(Encuesta modelo) throws SQLException {
        arreglo.actualizarArchivo();
        return true;
    }
    
    @Override
    public boolean eliminarPorCodigo(int codigo) throws SQLException {
        arreglo.eliminar(codigo);
        return true;
    }
    
    @Override
    public boolean desactivarPorCodigo(int codigo) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public List<Encuesta> listar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public int devolverCorrelativo() throws SQLException {
        return arreglo.codigoCorrelativo();
    }
    
    @Override
    public int devolverTamanio() throws SQLException {
        return arreglo.tamanio();
    }

    @Override
    public boolean eliminar(Encuesta modelo) throws SQLException {
       arreglo.eliminar(modelo);
       return true;
    }



    
}
