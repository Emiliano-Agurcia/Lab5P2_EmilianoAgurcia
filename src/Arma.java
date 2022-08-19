/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Arma {
    private String Nombre;
    private int Damage;
    private int Precision;

    public Arma() {
    }

    public Arma(String Nombre, int Damage, int Precision) {
        this.Nombre = Nombre;
        this.Damage = Damage;
        this.Precision = Precision;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getDamage() {
        return Damage;
    }

    public void setDamage(int Damage) {
        this.Damage = Damage;
    }

    public int getPrecision() {
        return Precision;
    }

    public void setPrecision(int Precision) {
        this.Precision = Precision;
    }

    @Override
    public String toString() {
        return "Nombre: " + Nombre + ", Daño: " + Damage + ", Precisión: " + Precision ;
    }
    
    
}
