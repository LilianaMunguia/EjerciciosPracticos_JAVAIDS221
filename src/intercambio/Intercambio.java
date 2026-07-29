/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intercambio;

/**
 *
 * @author liliq
 */
import java.util.Scanner;
public class Intercambio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int v1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int v2 = sc.nextInt();

        int aux = v1;
        v1 = v2;
        v2 = aux;

        System.out.println("Después del intercambio:");
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);

    }
    
}
