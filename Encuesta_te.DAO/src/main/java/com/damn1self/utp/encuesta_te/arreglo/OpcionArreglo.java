/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.damn1self.utp.encuesta_te.arreglo;
import com.damn1self.utp.encuesta_te.models.Opcion;
import com.damn1self.utp.encuesta_te.utils.EnumEscala;
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
public class OpcionArreglo {

    
    public ArrayList<Opcion> lista;
    private final String codigoInterno;

    public OpcionArreglo(ArrayList<Opcion> lista,String code) throws Exception {
        this.lista = lista;
        this.codigoInterno=code;
        cargarArchivoPlano();
    }



    public void adicionar(Opcion x) {
        lista.add(x);
        grabarArchivoPlano();
    }

    public int tamanio() {
        return lista.size();
    }

    public Opcion obtener(int i) {
        return lista.get(i);
    }

    public Opcion buscar(int correlativo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCorrelativo() == correlativo) {
                return obtener(i);
            }
        }
        return null;
    }
    
    public Opcion buscar(String codigo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigoPregunta().equals(codigo)) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Opcion x) {
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
            Opcion x;
            pw = new PrintWriter(new FileWriter( codigoInterno+"_opcion.txt"));
            for (int i = 0; i < tamanio(); i++) {
                x = obtener(i);
                linea = x.getCodigoPregunta()+ ";"
                        + x.getCorrelativo()+ ";"
                        + x.getOpcionString()+ ";"
                        + x.getMaximoValor()+ ";"
                        + x.getMinValor()+ ";"
                        + x.getEscala()+";";
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
            EnumEscala v6;
            double v4,v5;
            br = new BufferedReader(new FileReader(codigoInterno+"_opcion.txt"));
            while ((linea = br.readLine()) != null) {
                s = linea.split(";");
                v1 = s[0].trim();
                v2 = Integer.parseInt(s[1].trim());
                v3 = s[2].trim();
                v4 = Double.parseDouble(s[3].trim());
                v5 = Double.parseDouble(s[4].trim());
                v6 = EnumEscala.valueOf(s[5].trim());
                adicionar(new Opcion(v1, v2, v3, v4, v5,v6));
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
