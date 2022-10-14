package com.damn1self.utp.encuesta_te.dao.implementaciones;

import com.damn1self.utp.encuesta_te.arreglo.OpcionArreglo;
import com.damn1self.utp.encuesta_te.dao.*;
import com.damn1self.utp.encuesta_te.models.Opcion;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.utils.*;
/**
 *
 * @author DAMN
 */
public class OpcionDAOImpl implements OpcionDAO{

  


    private final ArrayList<Opcion> lista;
    private EnumFormato formato;
    private final OpcionArreglo arreglo;
    
    public OpcionDAOImpl(ArrayList<Opcion>lst,String codigo) throws Exception{
      lista=lst; 
      arreglo=new OpcionArreglo(lista,codigo);
    }

  
    
 
    @Override
    public List<Opcion> listar() throws SQLException {
       return (List<Opcion>) arreglo;
    }

    @Override
    public ArrayList<Opcion> listarArreglo() throws SQLException {
        return arreglo.lista;
    }

    @Override
    public Opcion listarPorCodigo(int codigo) throws SQLException {
       return arreglo.buscar(codigo);
    }

       @Override
    public Opcion listarPorCodigo(String codigo) throws SQLException {
       return arreglo.buscar(codigo);
    }
    
    @Override
    public Opcion listarPorPosicion(int posicion) throws SQLException {
       return arreglo.obtener(posicion);
    }

    @Override
    public boolean crear(Opcion modelo) throws SQLException {
       arreglo.adicionar(modelo);
       return true;
    }

    @Override
    public boolean modificar(Opcion modelo) throws SQLException {
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
    public int devolverCorrelativo() throws SQLException {
        return arreglo.codigoCorrelativo();
    }

    @Override
    public int devolverTamanio() throws SQLException {
        return arreglo.tamanio();
    }

    @Override
    public boolean eliminar(Opcion modelo) throws SQLException {
       arreglo.eliminar(modelo);
       return true;
    }

 


    
}
