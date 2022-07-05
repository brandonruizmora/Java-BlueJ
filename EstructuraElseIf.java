
public class EstructuraElseIf
{
    public static void ejecutarElseIf() {       
        
        int edad = 23;
        String descripcionEdad = "";
        
        //Operadores comparación >, <, ==, >=, <=
        //Operadores lógicos ||, &&
        
        //Estructura if else
        if(edad >= 18 && edad <= 40) {
            descripcionEdad = "Eres mayor de edad y no tan viejo";
        } else {
            descripcionEdad = "Eres menor de edad";
        }
        System.out.println(descripcionEdad);

    }
}
