package com.damn1self.utp.encuesta_te.models;

import java.util.ArrayList;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DAMN
 */
public class Encuesta {

   
    private String codigo; //Generar_Guid
    private String titulo;
    private String descripcion;
    private String unidadAnalisis;
    private Date fechaRegistro;
    private ArrayList<Pregunta> listaPreguntas;
    
    
    
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
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
     * @return the unidadAnalisis
     */
    public String getUnidadAnalisis() {
        return unidadAnalisis;
    }

    /**
     * @param unidadAnalisis the unidadAnalisis to set
     */
    public void setUnidadAnalisis(String unidadAnalisis) {
        this.unidadAnalisis = unidadAnalisis;
    }

    /**
     * @return the fechaRegistro
     */
    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * @param fechaRegistro the fechaRegistro to set
     */
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * @return the listaPreguntas
     */
    public ArrayList<Pregunta> getListaPreguntas() {
        return listaPreguntas;
    }

    /**
     * @param listaPreguntas the listaPreguntas to set
     */
    public void setListaPreguntas(ArrayList<Pregunta> listaPreguntas) {
        this.listaPreguntas = listaPreguntas;
    }    
    

}
