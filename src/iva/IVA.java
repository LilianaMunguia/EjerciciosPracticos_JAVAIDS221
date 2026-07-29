/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iva;

/**
 *
 * @author liliq
 */
import java.util.Scanner;

public class IVA {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Precio: ");
        double p = sc.nextDouble();

        double iva = p * 0.13;

        System.out.printf("IVA: $%.2f%n", iva);
    }

    
}
