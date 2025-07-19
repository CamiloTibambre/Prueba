package calculadoraa2;

import calculadoraa.Calculadoraa;
import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Calculadoraa calc = new Calculadoraa(); 
        
        int menu;

        System.out.println("--------------MENU----------------");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACION");
        System.out.println("4. DIVISION");
        System.out.print("Digite una opcion: ");
        menu = ent.nextInt();
        
        System.out.print("Ingrese el primer numero: ");
                int numeroX = ent.nextInt();
                calc.setNumeroX(numeroX);  

                System.out.print("Ingrese el segundo numero: ");
                int numeroY = ent.nextInt();
                calc.setNumeroY(numeroY); 

        switch (menu) {
            case 1:
                int suma = calc.getNumeroX() + calc.getNumeroY();
                calc.setSuma(suma); 

                System.out.println("El resultado de la suma es: " + calc.getSuma()); 
                break;
                
            case 2:
                int resta = calc.getNumeroX() - calc.getNumeroY();
                calc.setResta(resta); 

                System.out.println("El resultado de la resta es: " + calc.getResta()); 
                break;
            case 3: 
                int multiplicacion = calc.getNumeroX() * calc.getNumeroY();
                calc.setMultiplicacion(multiplicacion); 

                System.out.println("El resultado de la multiplicacion es: " + calc.getMultiplicacion()); 
                break;
            case 4: 
                  double division = calc.getNumeroX() / calc.getNumeroY();
                calc.setDivision(division); 

                System.out.println("El resultado de la division es: " + calc.getDivision()); 
                break;
                

            
        }
    }
}
