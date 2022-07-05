
/**
 * Write a description of class PrimeraClase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeraClase
{
    public static void main(String[] args) {
        //Tipos de datos  y variables
        int numeroInt = 10;
        double numeroDecimal = 10.05;
        //Operadores
        double resultado = numeroInt + numeroDecimal;
        String datoString = "Hola Mundo, mi número es: ";
        System.out.println(datoString + resultado);
        
        //Se utiliza final para denotar variables constantes
        final int valorConstante = 123;
        
        int edad = 23;
        String descripcionEdad = "";
        
        //Operadores comparación >, <, ==, >=, <=
        //Operadores lógicos ||, &&
        if(edad >= 18 && edad <= 40) {
            descripcionEdad = "Eres mayor de edad y no tan viejo";
        } else {
            descripcionEdad = "Eres menor de edad";
        }
        System.out.println(descripcionEdad);
        
    }
}
