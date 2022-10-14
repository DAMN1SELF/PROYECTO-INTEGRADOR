/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.arreglo;
import com.damn1self.utp.encuesta_te.models.Respuesta;
import com.damn1self.utp.encuesta_te.utils.EnumEscala;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author DAMN
 */
public class RespuestaArreglo {

    
    public ArrayList<Respuesta> lista;
    private final String codigoInterno;

    public RespuestaArreglo(ArrayList<Respuesta> lista,String code) throws Exception {
        this.lista = lista;
        this.codigoInterno=code;
        cargarArchivoPlano();
    }



    public void adicionar(Respuesta x) {
        lista.add(x);
        grabarArchivoPlano();
    }

    public int tamanio() {
        return lista.size();
    }

    public Respuesta obtener(int i) {
        return lista.get(i);
    }

    public Respuesta buscar(int correlativo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCorrelativo() == correlativo) {
                return obtener(i);
            }
        }
        return null;
    }
    
    public Respuesta buscar(String codigo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigoPregunta().equals(codigo)) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Respuesta x) {
        lista.remove(x);
        grabarArchivoPlano();
    }

    public void eliminar(int correlativo) {
        lista.remove(obtener(correlativo));
        grabarArchivoPlano();
    }

    public void eliminarTodos( ) {
        lista.removeAll(lista);
        grabarArchivoPlano();
    }

    public void actualizarArchivo(  ) {
        grabarArchivoPlano();
    }

    private void grabarArchivoPlano( ) {
        try {
            PrintWriter pw;
            String linea;
            Respuesta x;
            pw = new PrintWriter(new FileWriter( codigoInterno+"_respuesta.txt"));
            for (int i = 0; i < tamanio(); i++) {
                x = obtener(i);
                linea = x.getCodigoPregunta()+ ";"
                        + x.getCorrelativo()+ ";"
                        + x.getRptaString()+ ";";
                pw.println(linea);
            }
            pw.close();
        } catch (IOException e) {
        }
    }

    private void cargarArchivoPlano( )throws Exception {
        try {
            BufferedReader br;
            String linea;
            String[] s;
            String v1, v3;
            int v2;
            br = new BufferedReader(new FileReader(codigoInterno+"_respuesta.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                v1 = s[0].trim();
                v2 = Integer.parseInt(s[1].trim());
                v3 = s[2].trim();
                adicionar(new Respuesta(v1, v2, v3));
            }
            br.close();
        } catch (IOException | NumberFormatException  e) {
        }
    }
    public int codigoCorrelativo() {
        if (tamanio() == 10000) {
            return 1;
        } else {
            return obtener(tamanio() - 1).getCorrelativo() + 1;
        }
    }

}
