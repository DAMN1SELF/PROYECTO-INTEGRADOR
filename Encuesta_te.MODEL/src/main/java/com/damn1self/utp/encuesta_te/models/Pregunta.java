package com.damn1self.utp.encuesta_te.models;

import com.damn1self.utp.encuesta_te.model.variable_estadistica.VariableEstadistica;
import com.damn1self.utp.encuesta_te.utils.EnumVariableEstadistica;
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
public class Pregunta {


 
    private String codigoEncuesta; //hash
    private int correlativo;
    private String pregunta;
    private String detallePregunta;
    private int tipoPregunta;
    private ArrayList<Opcion> listaOpciones;
    private static int totalPreguntas;
    private ArrayList<Respuesta> listaRptas;

    
    static{
       totalPreguntas=0; 
    }
    public Pregunta(String codigoEncuesta,int correlativo,String pregunta,int tipoPregunta,String detallePregunta){
        this.codigoEncuesta=codigoEncuesta;
        this.correlativo=correlativo;
        this.pregunta=pregunta;
        this.tipoPregunta=tipoPregunta;
        this.detallePregunta=detallePregunta;
        totalPreguntas++;
    }
    
    public Pregunta(String codigoEncuesta,int correlativo,String pregunta,int tipoPregunta){
        this(codigoEncuesta,correlativo,pregunta,tipoPregunta,"sin detalle");
    }
    
    public Pregunta(String codigoEncuesta,int correlativo,String pregunta,int tipoPregunta,String detalle,ArrayList<Opcion> lst){
        this(codigoEncuesta,correlativo,pregunta,tipoPregunta,detalle);
        listaOpciones=lst;
    }
    
       public Pregunta(String codigoEncuesta,int correlativo,String pregunta,int tipoPregunta,ArrayList<Opcion> lst){
        this(codigoEncuesta,correlativo,pregunta,tipoPregunta,null,lst);
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
     * @return the listaOpciones
     */
    public ArrayList<Opcion> getListaOpciones() {
        return listaOpciones;
    }

    /**
     * @param listaOpciones the listaOpciones to set
     */
    public void setListaOpciones(ArrayList<Opcion> listaOpciones) {
        this.listaOpciones = listaOpciones;
    }

    /**
     * @return the codigoEncuesta
     */
    public String getCodigoEncuesta() {
        return codigoEncuesta;
    }

    /**
     * @param codigoEncuesta the codigoEncuesta to set
     */
    public void setCodigoEncuesta(String codigoEncuesta) {
        this.codigoEncuesta = codigoEncuesta;
    }
   /**
     * @return the detallePregunta
     */
    public String getDetallePregunta() {
        return detallePregunta;
    }

    /**
     * @param detallePregunta the detallePregunta to set
     */
    public void setDetallePregunta(String detallePregunta) {
        this.detallePregunta = detallePregunta;
    }

    
        /**
     * @return the listaRptas
     */
    public ArrayList<Respuesta> getListaRptas() {
        return listaRptas;
    }

    /**
     * @param listaRptas the listaRptas to set
     */
    public void setListaRptas(ArrayList<Respuesta> listaRptas) {
        this.listaRptas = listaRptas;
    }

    /**
     * @return the tipoPregunta
     */
    public int getTipoPregunta() {
        return tipoPregunta;
    }

    /**
     * @param tipoPregunta the tipoPregunta to set
     */
    public void setTipoPregunta(int tipoPregunta) {
        this.tipoPregunta = tipoPregunta;
    }

}
