/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vendingmachine;

import java.util.Scanner;

/**
 *
 * @author felip
 */
public class VendingMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int itemSelected;

        Chocolate Chocolate = new Chocolate("Milka", 1, 2.50);
        Crisp Crisp = new Crisp("Tayto", 5, 1.80);
        Jelly Jelly = new Jelly("Haribo", 10, 3.10);

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello! Welcome to Felipe's Vending Machine");
        System.out.println("Please select your product: ");
        System.out.println(1 + " " + Chocolate.getName() + "\n" + 5 + " " + Crisp.getName() + "\n" + 10 + " " + Jelly.getName());

        itemSelected = sc.nextInt();

        switch (itemSelected) {

            case 1:
              
                Chocolate.select(true);
                break;
            case 5:
                   Crisp.select(true);
                break;
            case 10:
                   Jelly.select(true);
                break;

        }

    }

}
