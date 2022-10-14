package com.damn1self.utp.encuesta_te.arreglo;
import com.damn1self.utp.encuesta_te.models.Encuesta;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
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

    public EncuestaArreglo(ArrayList<Encuesta> lista) {
        try {
            this.lista = lista;
            cargarArchivoPlano();
        } catch (Exception e) {
        }
    }

 
    /**
     * El metodo sirve para adicionar un objeto nuevo al arreglo
     * @param x => representa objeto  Encuesta
     */
    public void adicionar(Encuesta x) {
        try {
            this.lista.add(x);
            grabarArchivoPlano();
        } catch (Exception e) {
        }
    }

    public int tamanio() {
        try {

            return lista.size();
        } catch (Exception e) {
        }
        return -1;
    }

    public Encuesta obtener(int i) {
        try {
            return lista.get(i);
        } catch (Exception e) {
        }
        return null;
    }

    public Encuesta buscar(int correlativo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCorrelativo() == correlativo) {
                return obtener(i);
            }
        }
        return null;
    }

    public Encuesta buscar(String codigo) {
        for (int i = 0; i < tamanio(); i++) {
            if (obtener(i).getCodigo().equals(codigo)) {
                return obtener(i);
            }
        }
        return null;
    }

    public void eliminar(Encuesta x) {
        try {
            lista.remove(x);
            grabarArchivoPlano();
        } catch (Exception e) {
        }
    }

    public void eliminar(int correlativo) {
        try {
            lista.remove(obtener(correlativo));
            grabarArchivoPlano();
        } catch (Exception e) {
        }
    }

    public void eliminarTodos() {
        try {
            lista.removeAll(lista);
            grabarArchivoPlano();
        } catch (Exception e) {
        }
    }

    public void actualizarArchivo() {
        try {
            grabarArchivoPlano();
        } catch (Exception e) {
        }
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
                adicionar(new Encuesta(v1, v2, v3, v4, v5, v6, v7));
            }
            br.close();
        } catch (IOException | NumberFormatException  e) {
        }
    }

    public int codigoCorrelativo() {
        try {
            if (tamanio() == 0) {
                return 1000;
            } else {
                return obtener(tamanio() - 1).getCorrelativo() + 1;
            }
        } catch (Exception e) {
        }
        return -1;
    }

}
