package com.damn1self.utp.encuesta_te.dao.implementaciones;

import com.damn1self.utp.encuesta_te.arreglo.EncuestaArreglo;
import com.damn1self.utp.encuesta_te.dao.EncuestaDAO;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DAMN
 */
public class EncuestaDAOImpl implements EncuestaDAO{
    
    private final EncuestaArreglo arreglo;
    
    public EncuestaDAOImpl(EncuestaArreglo  arreglo){
      this.arreglo=arreglo;   
    }
    
    public EncuestaDAOImpl(){
      this.arreglo=new EncuestaArreglo();   
    }

    @Override
    public ArrayList<Encuesta> listarArreglo() throws SQLException {
        return arreglo.lista;
    }

    @Override
    public Encuesta listarPorCodigo(int codigo) throws SQLException {
       return arreglo.obtener(codigo);
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



    
}
