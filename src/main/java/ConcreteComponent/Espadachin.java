/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConcreteComponent;

/**
 *
 * @author estudiantes
 */
public class Espadachin extends Personaje.PersonajeBase {
     
    public Espadachin(){
        description = "Espadachin";
    }

    @Override
    public int calculateDamage() {
        return 20;  
    }
    
}
