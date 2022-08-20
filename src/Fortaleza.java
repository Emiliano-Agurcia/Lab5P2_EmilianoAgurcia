/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Fortaleza extends Personaje{

    public Fortaleza() {
        super();
    }

    public Fortaleza(String Nombre, int Vida, int Escudo, Arma Arma) {
        super(Nombre, Vida, Escudo, Arma);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Atacar(Personaje Usuario, Arma arma, Personaje Enemigo, int DamageTaken) {
        if(Enemigo instanceof Medico){
            arma.setDamage( (int) arma.getDamage()+10);
        }
        
        DamageTaken -= 100/0.15;
    }


    

}
