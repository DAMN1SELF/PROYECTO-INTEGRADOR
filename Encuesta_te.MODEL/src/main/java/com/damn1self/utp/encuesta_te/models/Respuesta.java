/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.models;

/**
 *
 * @author DAMN
 */
public class Respuesta {


    
    private String codigoPregunta;
    private int  correlativo;
    private String rptaString;
    
    public Respuesta(String codigoPregunta,int correlativo,String rptaString){
        this.codigoPregunta=codigoPregunta;
        this.correlativo=correlativo;
        this.rptaString=rptaString;
    }
    
    /**
     * @return the codigoPregunta
     */
    public String getCodigoPregunta() {
        return codigoPregunta;
    }

    /**
     * @param codigoPregunta the codigoPregunta to set
     */
    public void setCodigoPregunta(String codigoPregunta) {
        this.codigoPregunta = codigoPregunta;
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
     * @return the rptaString
     */
    public String getRptaString() {
        return rptaString;
    }

    /**
     * @param rptaString the rptaString to set
     */
    public void setRptaString(String rptaString) {
        this.rptaString = rptaString;
    }
    
    
}
