/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.damn1self.utp.encuesta_te.model.variable_estadistica;
import com.damn1self.utp.encuesta_te.utils.*;

/**
 *
 * @author DAMN
 */
public abstract class VariableEstadistica {

    
       private int codigo;
    private String descripcion;
    private boolean estado;
    private EnumTipoVariableEstadistica tipoVariableEst;
    private EnumVariableEstadistica variableEst;
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the tipoVariableEst
     */
    public EnumTipoVariableEstadistica getTipoVariableEst() {
        return tipoVariableEst;
    }

    /**
     * @param tipoVariableEst the tipoVariableEst to set
     */
    public void setTipoVariableEst(EnumTipoVariableEstadistica tipoVariableEst) {
        this.tipoVariableEst = tipoVariableEst;
    }

    /**
     * @return the variableEst
     */
    public EnumVariableEstadistica getVariableEst() {
        return variableEst;
    }

    /**
     * @param variableEst the variableEst to set
     */
    public void setVariableEst(EnumVariableEstadistica variableEst) {
        this.variableEst = variableEst;
    }
    
 
    
    
    //public void Graficar(EnumTipoGrafo grafo); 
    
}
