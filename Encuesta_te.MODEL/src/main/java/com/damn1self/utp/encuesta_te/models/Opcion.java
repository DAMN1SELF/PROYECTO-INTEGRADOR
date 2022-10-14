package com.damn1self.utp.encuesta_te.models;

import com.damn1self.utp.encuesta_te.utils.EnumEscala;

/**
 *
 * @author DAMN
 */
public class Opcion {

    private String codigoPregunta;
    private int opcionNumerica;
    private String opcionString;
    private double maximoValor;
    private double minValor;
    private EnumEscala escala;

    Opcion(String codigoPregunta, String opcionString, int opcionNumerica) {
        this.codigoPregunta = codigoPregunta;
        this.opcionString = opcionString;
        this.opcionNumerica = opcionNumerica;
    }

    public Opcion(String codigoPregunta, String opcionString, int opcionNumerica, double maximoValor, double minValor) {
        this(codigoPregunta, opcionString, opcionNumerica);

        this.maximoValor = maximoValor;
        this.minValor = minValor;
    }

    public Opcion(String codigoPregunta, String opcionString, int opcionNumerica, EnumEscala scala) {
        this(codigoPregunta, opcionString, opcionNumerica);
        this.escala = scala;
    }
    
    public Opcion(String codigoPregunta, int opcionNumerica, String opcionString, double maximoValor, double minValor, EnumEscala scala) {
        this(codigoPregunta, opcionString, opcionNumerica,maximoValor,minValor);
        this.escala=scala;
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
     * @return the opcionNumerica
     */
    public int getCorrelativo() {
        return opcionNumerica;
    }

    /**
     * @param opcionNumerica the opcionNumerica to set
     */
    public void setCorrelativo(int opcionNumerica) {
        this.opcionNumerica = opcionNumerica;
    }

    /**
     * @return the opcionString
     */
    public String getOpcionString() {
        return opcionString;
    }

    /**
     * @param opcionString the opcionString to set
     */
    public void setOpcionString(String opcionString) {
        this.opcionString = opcionString;
    }

    /**
     * @return the maximoValor
     */
    public double getMaximoValor() {
        return maximoValor;
    }

    /**
     * @param maximoValor the maximoValor to set
     */
    public void setMaximoValor(double maximoValor) {
        this.maximoValor = maximoValor;
    }

    /**
     * @return the minValor
     */
    public double getMinValor() {
        return minValor;
    }

    /**
     * @param minValor the minValor to set
     */
    public void setMinValor(double minValor) {
        this.minValor = minValor;
    }

    /**
     * @return the escala
     */
    public EnumEscala getEscala() {
        return escala;
    }

    /**
     * @param escala the escala to set
     */
    public void setEscala(EnumEscala escala) {
        this.escala = escala;
    }

}
