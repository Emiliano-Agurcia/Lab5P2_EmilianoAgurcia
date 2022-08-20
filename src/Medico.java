
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emili
 */
public class Medico extends Personaje{
Random random = new Random();
    public Medico() {
        super();
    }

    public Medico(String Nombre, int Vida, int Escudo, Arma Arma) {
        super(Nombre, Vida, Escudo, Arma);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void Atacar(Personaje Usuario, Arma arma, Personaje Enemigo, int DamageTaken) {
        if(Enemigo instanceof Rastreador){
            arma.setDamage( (int) arma.getDamage()+5);
        }
        
        Usuario.setVida( (int) Usuario.getVida() + (1+random.nextInt(10)) );
        
    }

    
}
