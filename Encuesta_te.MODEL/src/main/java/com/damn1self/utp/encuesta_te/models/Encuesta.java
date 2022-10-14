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
    private int correlativo;
    private String titulo;
    private String encargado;
    private String descripcion;
    private String concepto;
    private String unidadAnalisis;
    private Date fechaRegistro;
    private ArrayList<Pregunta> listaPreguntas;

    public Encuesta(String codigo, int correlativo, String titulo, String encargado, String descripcion, String concepto, String unidadAnalisis, Date fechaRegistro ) {
        this.codigo = codigo;
        this.correlativo = correlativo;
        this.titulo = titulo;
        this.encargado = encargado;
        this.descripcion = descripcion;
        this.concepto = concepto;
        this.unidadAnalisis = unidadAnalisis;
        this.fechaRegistro = fechaRegistro;
    }
    
    public Encuesta(String codigo, int correlativo, String titulo, String encargado, String descripcion, String concepto, String unidadAnalisis, Date fechaRegistro, ArrayList<Pregunta> listaPreguntas) {
        this(codigo,correlativo,titulo,encargado,descripcion,concepto,unidadAnalisis,fechaRegistro);
        this.listaPreguntas = listaPreguntas;
        
    }
    public Encuesta(String codigo, int correlativo, String titulo, String encargado, String descripcion, String concepto, String unidadAnalisis) {
        this.codigo = codigo;
        this.correlativo = correlativo;
        this.titulo = titulo;
        this.encargado = encargado;
        this.descripcion = descripcion;
        this.concepto = concepto;
        this.unidadAnalisis = unidadAnalisis;
        
    }
  

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
     * @return the concepto
     */
    public String getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the correlativo
     */
    public int getCorrelativo() {
        return correlativo;
    }

    /**
     * @param correlativo the correlativo to set
     */
    public void setCorrelativo(int correlativo) {
        this.correlativo = correlativo;
    }
    /**
     * @return the encargado
     */
    public String getEncargado() {
        return encargado;
    }

    /**
     * @param encargado the encargado to set
     */
    public void setEncargado(String encargado) {
        this.encargado = encargado;
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
