/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.generico;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author DAMN
 */
public abstract class Arreglo<T> {
    
    //  Atributos privados
    public ArrayList<T> lista ;
    public String code;
    //  Constructor

    public void NuevoElemento(ArrayList lista ,String codigo) throws SQLException {
       // UUID uuid=UUID.randomUUID();
        this.code = codigo;//
        this.lista = lista;
        cargarModelo();
    }
    public  T NuevoElemento(ArrayList lista ) throws SQLException {
        UUID uuid=UUID.randomUUID();
        this.code = uuid.toString();//
        NuevoElemento(lista,code);
        return null;
    }

    public void adicionar(T modelo) throws SQLException {
        this.lista.add(modelo);
        grabarModelo();
    }

    public int tamanio()throws SQLException {
        return this.lista.size();
    }

    public T obtener(int posicion) throws SQLException {
        return this.lista.get(posicion);
    }
    public void  eliminar(T modelo) throws SQLException {
        this.lista.remove(modelo);
        grabarModelo();
    }
    public abstract T buscar(String codigo)throws SQLException;
    public abstract void cargarModelo()throws SQLException;
    public abstract void grabarModelo()throws SQLException;


    




	
}
