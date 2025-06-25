/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Personaje;
import ConcreteComponent.Espadachin;
import ArmorDecorator.Casco;
import ArmorDecorator.Pechera;
import ArmorDecorator.Guantes;

/**
 *
 * @author estudiantes
 */
public class Personaje {

    public static void main(String[] args) {
        PersonajeBase personaje1 = new Espadachin();
        PersonajeBase personaje2 = new Espadachin();
        PersonajeBase personaje3 = new Espadachin();
        personaje1 = new Casco(personaje1);
        personaje2 = new Casco(personaje2);
        personaje2 = new Pechera(personaje2);
        personaje3 = new Casco(personaje3);
        personaje3 = new Pechera(personaje3);
        personaje3 = new Guantes(personaje3);
        
        System.out.println("Espadachin con casco    Daño recibido: " + personaje1.calculateDamage());
        System.out.println("Daño con casco y pechera       Daño recibido: " + personaje2.calculateDamage());
        System.out.println("Daño con casco, pechera y guantes       Daño recibido: " + personaje3.calculateDamage());
    }
}
