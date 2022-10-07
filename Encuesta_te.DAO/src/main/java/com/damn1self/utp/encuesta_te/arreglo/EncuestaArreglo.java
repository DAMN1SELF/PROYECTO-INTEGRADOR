/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.arreglo;

import com.damn1self.utp.encuesta_te.models.Encuesta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author DAMN
 */
public class EncuestaArreglo {


  

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public ArrayList<Encuesta> lista;

    public EncuestaArreglo() {
        lista = new ArrayList<Encuesta>();
        cargarArchivoPlano();
    }
    
    public void adicionar(Encuesta x) {
        lista.add(x);
        grabarArchivoPlano();
    }

    public int tamanio() {
        return lista.size();
    }

    public Encuesta obtener(int i) {
        return lista.get(i);
    }

    public Encuesta buscar(int correlativo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCorrelativo() == correlativo) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Encuesta x) {
       lista.remove(x);
        grabarArchivoPlano();
    }
    
    public void eliminar(int correlativo) {
       lista.remove(obtener(correlativo));
        grabarArchivoPlano();
    }
     public void eliminarTodos() {
        lista.removeAll(lista);
        grabarArchivoPlano();
    }

    public void actualizarArchivo() {
        grabarArchivoPlano();
    }
  
    private void grabarArchivoPlano() {
        try {
            PrintWriter pw;
            String linea;
            Encuesta x;
            pw = new PrintWriter(new FileWriter("encuestas.txt"));
            for (int i = 0; i < tamanio(); i++) {
                x = obtener(i);
                linea = x.getCodigo() + ";"
                        + x.getCorrelativo() + ";"
                        + x.getTitulo() + ";"
                        + x.getEncargado() + ";"
                        + x.getDescripcion() + ";"
                        + x.getConcepto() + ";"
                        + x.getUnidadAnalisis() + ";"
                        + x.getFechaRegistro() + ";";
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
        }
    }

    private void cargarArchivoPlano() {
        try {
            BufferedReader br;
            String linea;
            String[] s;
            String v1, v3, v4, v5, v6, v7;
            int v2;
            Date v8;
            br = new BufferedReader(new FileReader("encuestas.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                v1 = s[0].trim();
                v2 = Integer.parseInt(s[1].trim());
                v3 = s[2].trim();
                v4 = s[3].trim();
                v5 = s[4].trim();
                v6 = s[5].trim();
                v7 = s[6].trim();
                v8 = formatter.parse(s[7].trim());
                adicionar(new Encuesta(v1, v2, v3, v4, v5, v6, v7, v8));
            }
            br.close();
        } catch (IOException | NumberFormatException | ParseException e) {
        }
    }

    public int codigoCorrelativo() {
        if (tamanio() == 0) {
            return 1000;
        } else {
            return obtener(tamanio() - 1).getCorrelativo() + 1;
        }
    }

    

}
