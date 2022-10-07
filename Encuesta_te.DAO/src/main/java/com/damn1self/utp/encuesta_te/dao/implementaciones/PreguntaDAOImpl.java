package com.damn1self.utp.encuesta_te.dao.implementaciones;

import com.damn1self.utp.encuesta_te.arreglo.PreguntaArreglo;
import com.damn1self.utp.encuesta_te.dao.*;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.damn1self.utp.encuesta_te.utils.*;
/**
 *
 * @author DAMN
 */
public class PreguntaDAOImpl implements PreguntaDAO{

  
    
    private EnumFormato formato;
    private final PreguntaArreglo arreglo;
    
    public PreguntaDAOImpl(PreguntaArreglo  arreglo , EnumFormato formato){
      this.arreglo=arreglo; 
      this.formato=formato;
    }

    public PreguntaDAOImpl(EnumFormato formato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
    @Override
    public List<Pregunta> listar() throws SQLException {
       return (List<Pregunta>) arreglo;
    }

    @Override
    public ArrayList<Pregunta> listarArreglo() throws SQLException {
        return arreglo.lista;
    }

    @Override
    public Pregunta listarPorCodigo(int codigo) throws SQLException {
       return arreglo.obtener(codigo);
    }

    @Override
    public boolean crear(Pregunta modelo) throws SQLException {
       arreglo.adicionar(modelo);
       return true;
    }

    @Override
    public boolean modificar(Pregunta modelo) throws SQLException {
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


    
}
