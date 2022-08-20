/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Rastreador extends Personaje{

    public Rastreador() {
        super();
    }

    public Rastreador(String Nombre, int Vida, int Escudo, Arma Arma) {
        super(Nombre, Vida, Escudo, Arma);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Atacar(Personaje Usuario, Arma arma, Personaje Enemigo, int DamageTaken) {
        if(Enemigo instanceof Medico || Enemigo instanceof Fortaleza){
            arma.setDamage( (int) arma.getDamage()+10);
        }
        arma.setPrecision(arma.getPrecision()+10);
    }

    
    
}
