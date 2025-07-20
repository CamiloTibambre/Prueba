
package suma;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        System.out.println("Aprende a sumar con Lancheros y Tibambre");
        
        int numeroX;
        int numeroY;
        int resultado;
        int suma;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero para sumar: ");
        numeroX = in.nextInt();
        System.out.print("Ingrese el segundo numero para sumar: ");
        numeroY = in.nextInt();
            
        suma = numeroX + numeroY;
        System.out.println("El resultado de la suma es: " + suma);
    }
}

