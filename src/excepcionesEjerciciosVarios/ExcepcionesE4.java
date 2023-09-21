package excepcionesEjerciciosVarios;

import Entities.Tipologias;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionesE4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Todas estas operaciones puede tirar excepciones a manejar,
//        el ingreso por teclado puede causar una excepción de tipo InputMismatchException,
//       el método Integer.parseInt() si la cadena no puede convertirse a entero, arroja una NumberFormatException 
//        y además, al dividir un número por cero surge una ArithmeticException
//        Manipule todas las posibles excepciones utilizando bloques try  /catch para las distintas excepciones
        Scanner leer = new Scanner(System.in);

        try {
            System.out.println("Por favor, ingrese un numero entero para el divisor");
            int num = leer.nextInt();
            leer.nextLine();
            System.out.println("Ingrese otro número entero para el dividendo");
            String numCadena = leer.nextLine();
            int numParseado = Integer.parseInt(numCadena);
            int resultado = num / numParseado;
            System.out.println("El resultado de la división es: " + resultado);
        } 
        catch (InputMismatchException e) {
            System.out.println("El valor ingresado no es un número entero");
        } 
        catch(NumberFormatException e){
            System.out.println("El número ingresado no es un entero");
        }
        catch(ArithmeticException e){
            System.out.println("La división no es posible. Se está intentando realizar una división por cero");
        }
    }

}
