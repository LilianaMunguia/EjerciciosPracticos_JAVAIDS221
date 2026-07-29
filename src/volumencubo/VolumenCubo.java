/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volumencubo;

/**
 *
 * @author liliq
 */
import java.util.Scanner;

public class VolumenCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la arista del cubo: ");
        double arista = sc.nextDouble();

        double volumen = Math.pow(arista, 3);

        System.out.printf("El volumen del cubo es: %.2f%n", volumen);  
    }
    
}
