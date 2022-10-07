/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.arreglo;

import com.damn1self.utp.encuesta_te.generico.Arreglo;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author DAMN
 */
public class PreguntaArreglo extends Arreglo<Pregunta> {

    private final ArrayList<Pregunta> pregunta;

    public PreguntaArreglo() throws SQLException {
        pregunta = new ArrayList<Pregunta>();
        NuevoElemento(pregunta);
    }

    @Override
    public Pregunta buscar(String codigo) throws SQLException {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigo().equals(codigo)) {
                return obtener(i);
            }
        }
        return null;
    }

    @Override
    public void cargarModelo() throws SQLException {
        try {
            PrintWriter pw;
            String linea;
            Pregunta x;
            pw = new PrintWriter(new FileWriter("preguntas.txt"));
            for (int i = 0; i < tamanio(); i++) {
                x = obtener(i);
                linea = x.getCodigo() + ";"
                        + x.getPregunta() + ";"
                        + x.getEstado() + ";";
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
        }
    }

    @Override
    public void grabarModelo() throws SQLException {
        try {
            BufferedReader br;
            String linea;
            String[] s;
            String cod, prg, std;
            br = new BufferedReader(new FileReader("preguntas.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                cod = s[0].trim();
                prg = s[1].trim();
                std = s[2].trim();
                adicionar(new Pregunta(cod, prg, std));
            }
            br.close();
        } catch (IOException | SQLException e) {
        }
    }

}
