package excepcionesEjerciciosVarios;

import Entities.DivisionNumero;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class ExcepcionesE3 {

    /**
     * @param args the command line arguments
     *
     */
    public static void main(String[] args) {
        //En el método main utilice un Scanner para leer dos números en forma de cadena. 
//A continuación, utilice el método parseInt() de la clase Integer, para convertir las 
//cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar una 
//división con los dos numeros y mostrar el resultado.

        DivisionNumero nd = new DivisionNumero();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el divisor");
        String num1 = leer.nextLine();
        System.out.println("Ingrese el dividendo");
        String num2 = leer.nextLine();
        
        //paso los numeros ingresados parseados
        nd.setNum1(parseInt(num1));
        nd.setNum2(parseInt(num2));
        
        //Hago la comprobación
        try{
            //llamo al método
            nd.division();
        } catch(Exception e){
            //Defino que capture cualquier tipo de error y muestro el mensaje
            System.out.println("La división no es posible de realizar por: " + e.getMessage());
        }
        
    }

}
