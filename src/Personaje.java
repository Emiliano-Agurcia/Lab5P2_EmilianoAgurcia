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
    private double Vida;
    private double Escudo;
    private Arma Arma = new Arma();

    public Personaje() {
    }

    public Personaje(String Nombre, double Vida, double Escudo) {
        this.Nombre = Nombre;
        this.Vida = Vida;
        this.Escudo = Escudo;
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

    public void setVida(double Vida) {
        this.Vida = Vida;
    }

    public double getEscudo() {
        return Escudo;
    }

    public void setEscudo(double Escudo) {
        this.Escudo = Escudo;
    }

    @Override
    public String toString() {
        return "Personaje{" + "Nombre: " + Nombre + ", Vida: " + Vida + "%, Escudo: " + Escudo + '}';
    }
    
    
}
