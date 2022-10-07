/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.models;

import com.damn1self.utp.encuesta_te.models.Respuesta;
import java.util.ArrayList;

/**
 *
 * @author DAMN
 */
public class Pregunta {

    
    private String codigo;
    private String pregunta;
    private String estado;
    
    public Pregunta(String codigo,String pregunta,String estado){
        this.codigo=codigo;
        this.pregunta=pregunta;
        this.estado=estado;
    }
    
    private ArrayList<Respuesta> listaRespuesta;
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the listaRespuesta
     */
    public ArrayList<Respuesta> getListaRespuesta() {
        return listaRespuesta;
    }

    /**
     * @param listaRespuesta the listaRespuesta to set
     */
    public void setListaRespuesta(ArrayList<Respuesta> listaRespuesta) {
        this.listaRespuesta = listaRespuesta;
    }

    /**
     * @return the pregunta
     */
    public String getPregunta() {
        return pregunta;
    }

    /**
     * @param pregunta the pregunta to set
     */
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    
}
