
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Personaje {
    private String Nombre;
    private int Vida;
    private int Escudo;
    private Arma Arma = new Arma();

    public Personaje() {
    }

    public Personaje(String Nombre, int Vida, int Escudo, Arma Arma) {
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.Escudo = Escudo;
        this.Arma = Arma;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getVida() {
        return Vida;
    }

    public void setVida(int Vida) {
        this.Vida = Vida;
        
    }

    public double getEscudo() {
        return Escudo;
    }

    public void setEscudo(int Escudo) {
        this.Escudo = Escudo;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Vida: " + Vida + ", Escudo: " + Escudo;
    }
    
    
}
