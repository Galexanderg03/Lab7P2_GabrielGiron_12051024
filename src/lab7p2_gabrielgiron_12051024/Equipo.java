/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_gabrielgiron_12051024;

/**
 *
 * @author Galex
 */
public class Equipo {
    private String Nombre;
    private int Ganados = 0;
    private int Perdidos = 0;
    private int Empatados = 0;
    private int GolesFavor = 0;
    private int GolesContra = 0;
    private int Puntos = 0;

    public Equipo(String Nombre) {
        this.Nombre = Nombre;
    }

    public Equipo(String Nombre, int Ganados, int Perdidos, int Empatados, int GolesFavor, int GolesContra)
    {
        this.Nombre = Nombre;
        this.Ganados = Ganados;
        this.Perdidos = Perdidos;
        this.GolesFavor = GolesFavor;
        this.GolesContra = GolesContra;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getGanados() {
        return Ganados;
    }

    public void setGanados(int Ganados) {
        this.Ganados = Ganados;
    }

    public int getPerdidos() {
        return Perdidos;
    }

    public void setPerdidos(int Perdidos) {
        this.Perdidos = Perdidos;
    }

    public int getEmpatados() {
        return Empatados;
    }

    public void setEmpatados(int Empatados) {
        this.Empatados = Empatados;
    }

    public int getGolesFavor() {
        return GolesFavor;
    }

    public void setGolesFavor(int GolesFavor) {
        this.GolesFavor = GolesFavor;
    }

    public int getGolesContra() {
        return GolesContra;
    }

    public void setGolesContra(int GolesContra) {
        this.GolesContra = GolesContra;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
}
