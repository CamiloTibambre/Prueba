
package ejercicioss;
import ejercicioss.variables;



public class Ejercicioss {
    

    public static void main(String[] args) {
        
      
        variables objNombre = new variables();
        
        System.out.println("su nombre es: " + objNombre.getNombre());
        System.out.println("su sexo es: " + objNombre.getSexo());
        System.out.println("su edad es: " + objNombre.getEdad());
        System.out.println("su salario es: " + objNombre.getSalario());
        System.out.println("Tiene Vehiculo? " + objNombre.isTransporte());
        
    }
    
}
