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
    private double Damage;
    private int Precision;

    public Arma() {
    }

    public Arma(String Nombre, double Damage, int Precision) {
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

    public void setDamage(double Damage) {
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
        return "Arma{" + "Nombre=" + Nombre + ", Damage=" + Damage + ", Precision=" + Precision + '}';
    }
    
    
}