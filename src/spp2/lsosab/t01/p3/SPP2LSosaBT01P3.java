//Luisa Fernanda Sosa Brambila

// A01411485
// IIS
package spp2.lsosab.t01.p3;
import java.util.Scanner;
/**
 *
 * @author Fernanda
 */
public class SPP2LSosaBT01P3 {

    public static void main(String[] args) {
        System.out.println("Calculadora de distancia entre dos puntos en x,y");
        Scanner teclado= new Scanner(System.in);
        double d, x1, y1, x2, y2;
        
        System.out.println("Ingrese datos del punto 1...");
        System.out.println("Ingrese la coordenada en x del punto 1");
        x1= teclado.nextDouble();
        System.out.println("Ingrese la coordenada en y del punto 1");
        y1= teclado.nextDouble();
        
        System.out.println("Ingrese datos del punto 2...");
        System.out.println("Ingrese la coordenada en x del punto 2");
        x2= teclado.nextDouble();
        System.out.println("Ingrese la coordenada en y del punto 2");
        y2= teclado.nextDouble();
        
        d= Math.sqrt ((Math.pow(x1-x2,2)) + (Math.pow(y1-y2,2)));
        
        System.out.println("La distancia es igual a : "+ d);
        
    }
    
}
