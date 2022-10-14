package com.damn1self.utp.encuesta_te.dao.implementaciones;

import com.damn1self.utp.encuesta_te.arreglo.RespuestaArreglo;
import com.damn1self.utp.encuesta_te.dao.*;
import com.damn1self.utp.encuesta_te.models.Respuesta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.utils.*;
/**
 *
 * @author DAMN
 */
public class RespuestaDAOImpl implements RespuestaDAO{

  


    private final ArrayList<Respuesta> lista;
    private EnumFormato formato;
    private final RespuestaArreglo arreglo;
    
    public RespuestaDAOImpl(ArrayList<Respuesta>lst,String codigo) throws Exception{
      lista=lst; 
      arreglo=new RespuestaArreglo(lista,codigo);
    }

  
    
 
    @Override
    public List<Respuesta> listar() throws SQLException {
       return (List<Respuesta>) arreglo;
    }

    @Override
    public ArrayList<Respuesta> listarArreglo() throws SQLException {
        return arreglo.lista;
    }

    @Override
    public Respuesta listarPorCodigo(int codigo) throws SQLException {
       return arreglo.buscar(codigo);
    }

    @Override
    public Respuesta listarPorCodigo(String codigo) throws SQLException {
       return arreglo.buscar(codigo);
    }
    
    @Override
    public Respuesta listarPorPosicion(int posicion) throws SQLException {
       return arreglo.obtener(posicion);
    }

    @Override
    public boolean crear(Respuesta modelo) throws SQLException {
       arreglo.adicionar(modelo);
       return true;
    }

    @Override
    public boolean modificar(Respuesta modelo) throws SQLException {
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
    public boolean eliminar(Respuesta modelo) throws SQLException {
       arreglo.eliminar(modelo);
       return true;
    }

 


    
}
