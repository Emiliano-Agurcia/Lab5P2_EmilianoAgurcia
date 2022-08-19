/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Jugador {
    private String Nombre;
    private int ID;
    private char[] Password;
    private Personaje Personaje = new Personaje();

    public Jugador() {
    }

    public Jugador(String Nombre, int ID, char[] Password) {
        this.Nombre = Nombre;
        this.ID = ID;
        this.Password = Password;
    }

    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public char[] getPassword() {
        return Password;
    }

    public void setPassword(char[] Password) {
        this.Password = Password;
    }

    

    public Personaje getPersonaje() {
        return Personaje;
    }

    public void setPersonaje(Personaje Personaje) {
        this.Personaje = Personaje;
    }

    @Override
    public String toString() {
        return "Jugador{" + "Nombre=" + Nombre + ", ID=" + ID + ", Password=" + Password + ", Personaje=" + Personaje + '}';
    }
    
    
}
