/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendingmachine;

/**
 *
 * @author felip
 */
public class Products {

    private String name;
    private int locationMachine;
    private int price;
    private boolean selected;

    public Products(String name, int locationMachine, int price) {
        this.name = name;
        this.locationMachine = locationMachine;
        this.price = price;
    }

    public void setLocationMachine(int locationMachine) {
        this.locationMachine = locationMachine;
    }
    
    public void select(boolean selected){
    if(selected){
        System.out.println("Enjoy your " + this.name);
       
   
    
    }
    

}}
