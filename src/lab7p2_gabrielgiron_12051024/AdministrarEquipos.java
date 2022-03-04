/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron_12051024;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Galex
 */
public class AdministrarEquipos {
    private ArrayList<Equipo> ListaEquipos = new ArrayList();
    private File archivo = null;

    public AdministrarEquipos(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return ListaEquipos;
    }

    public void setListaPersonas(ArrayList<Equipo> ListaEquipo) {
        this.ListaEquipos = ListaEquipos;
    }

    @Override
    public String toString() {
        return "listaEquipos=" + ListaEquipos;
    }

    //extra mutador
    public void setEquipo(Equipo E) {
        this.ListaEquipos.add(E);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipo E : ListaEquipos) {
                bw.write(E.getNombre() + ",");
                bw.write(E.getGanados() + ",");
                bw.write(E.getPerdidos() + ",");
                bw.write(E.getEmpatados() + ",");
                bw.write(E.getGolesFavor() + ",");
                bw.write(E.getGolesContra() + ",");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        ListaEquipos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(",");
                while (sc.hasNext()) {
                    ListaEquipos.add(new Equipo(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
