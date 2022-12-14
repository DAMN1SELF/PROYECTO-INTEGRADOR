/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.arreglo;
import com.damn1self.utp.encuesta_te.models.Pregunta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author DAMN
 */
public class PreguntaArreglo {

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public ArrayList<Pregunta> lista;

    public PreguntaArreglo(ArrayList<Pregunta> lista) throws Exception {
        this.lista = lista;
        cargarArchivoPlano();
    }



    public void adicionar(Pregunta x) {
        lista.add(x);
        grabarArchivoPlano();
    }

    public int tamanio() {
        return lista.size();
    }

    public Pregunta obtener(int i) {
        return lista.get(i);
    }

    public Pregunta buscar(int correlativo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCorrelativo() == correlativo) {
                return obtener(i);
            }
        }
        return null;
    }
    
    public Pregunta buscar(String codigo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigoEncuesta().equals(codigo)) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Pregunta x) {
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
            Pregunta x;
            pw = new PrintWriter(new FileWriter("preguntas.txt"));
            for (int i = 0; i < tamanio(); i++) {
                x = obtener(i);
                linea = x.getCodigoEncuesta()+ ";"
                        + x.getCorrelativo() + ";"
                        + x.getPregunta()+ ";"
                        + x.getTipoPregunta()+ ";"
                        + x.getDetallePregunta()+ ";";
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
        }
    }

    private void cargarArchivoPlano()throws Exception {
        try {
            BufferedReader br;
            String linea;
            String[] s;
            String v1, v3, v5;
            int v4;
            int v2;
            br = new BufferedReader(new FileReader("preguntas.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                v1 = s[0].trim();
                v2 = Integer.parseInt(s[1].trim());
                v3 = s[2].trim();
                v4 = Integer.parseInt(s[3].trim());
                v5 = s[4].trim();
                adicionar(new Pregunta(v1, v2, v3, v4, v5));
            }
            br.close();
        } catch (IOException | NumberFormatException  e) {
        }
    }
   public int codigoCorrelativo() {
      /*  try {
            if (tamanio() == 0) {
                return 1000;
            } else {
                return obtener(tamanio() - 1).getCorrelativo() + 1;
            }
        } catch (Exception e) {
        }
        return -1;
*/
     return tamanio();
}
}
