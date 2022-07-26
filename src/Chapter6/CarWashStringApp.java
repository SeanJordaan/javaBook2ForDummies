/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chapter6;

/**
 *
 * @author Sean
 */
//switching with a sting, the clients input will be capatilazed before the switch statement will run 
//this is also a falling through statement as in carWash1 app it only breaks at the end 
import java.util.Scanner;

public class CarWashStringApp {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The car wash application\n\n");
        System.out.print("Enter the package code: ");
        String s = sc.next();
        String details = "";
        switch (s.toUpperCase()) { //toUppercase converts the words to upper case 
            case "PRESIDENTIAL":
                details += "\tNew Car Scent, plus ... \n";
            case "ELITE":
                details += "\tTire Treatment, plus ... \n";
            case "DELUXE":
                details += "\tLeather/Vinyl Treatment, plus ... \n";
            case "SUPER":
                details += "\tWax, plus ... \n";
            case "STANDARD":
                details += "\tWash, vacuum, and hand dry.\n";
                break;
            default:
                details = "That's not one of the codes.";
                break;
        }
        System.out.println("\nThat package includes:\n");
        System.out.println(details);
    }
}
