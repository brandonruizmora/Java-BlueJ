
public class Arreglos
{
    public static void ejecutarArreglos() {
        
        //Inicializar array en Java con contenido
        int[] arregloEnteros = {100, 200, 300};
        
        System.out.println("arregloEnteros[2]: " + arregloEnteros[2]);
        
        //Declarar array de caracteres
        char arrayCaracteres[];
        //Inicializarlo y asignar el tamaño
        arrayCaracteres = new char[10];
        arrayCaracteres[2] = 'b';

        System.out.println("arrayCaracteres.length: " + arrayCaracteres.length);
        
        //Imprimir los elementos de un array
        for(int i = 0; i < arrayCaracteres.length; i++) {
            System.out.println("posicion " + i + ": " + arrayCaracteres[i]);
        }        
    }
}
