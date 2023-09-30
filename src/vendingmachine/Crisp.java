/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author felip
 */
public class Crisp extends Products{
    
    boolean selected;
    
    public Crisp(String name, int locationMachine, double price) {
        super(name, locationMachine, price);
    }
    
    
    public void select(boolean selected) {
        if (selected) {
            System.out.println("Enjoy your " + this.name);

        }
    }
    
}
