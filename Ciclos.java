
public class Ciclos {
    
    public static void ejecutarCiclos() {
        
        //Estructura ciclo for
        for(int i = 0; i < 10; i++) {
            System.out.println("Ciclo for" + i);
            /*
             * Se puede agregar condiciones que reinicien el ciclo
             * if() {
             *     i = 0;
             *  }
            */
        }
        
        //Estructura ciclo while
        int j = 1;
        while(j < 1) {
            System.out.println("Ciclo while" + j);
            j++;
        }
        
        //Estructura ciclo do while
        int k = 1;
        do {
            System.out.println("Ciclo do while" + k);
            k++;
        }while(k < 1);
        
        /*
         * Diferencias While y Do While
         * While entra primero a la condición luego ejecuta el bloque de código
         * Do While primero ejecuta el bloque de código luego a la condición
         */
    }
    
}
