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

    public String name;
    private int locationMachine;
    private double price;
  

    public Products(String name, int locationMachine, double price) {
        this.name = name;
        this.locationMachine = locationMachine;
        this.price = price;
    }

    public String getName() {
        return name;
    }
}
