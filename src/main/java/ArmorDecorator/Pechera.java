/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArmorDecorator;

import Personaje.PersonajeBase;

/**
 *
 * @author estudiantes
 */
public class Pechera extends ArmorDecorator{
    PersonajeBase personaje;
    
    public Pechera(PersonajeBase personaje){
        this.personaje = personaje;
    }

    @Override
    public int calculateDamage(){
        return personaje.calculateDamage() - 10;
    }
}
