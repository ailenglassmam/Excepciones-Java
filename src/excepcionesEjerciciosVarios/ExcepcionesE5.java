package excepcionesEjerciciosVarios;

import java.util.Scanner;

public class ExcepcionesE5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa en Java que juegue con el usuario a adivinar un número
//        . La computadora debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo.Para ello, cada vez que el usuario introduce un valor
//        , la computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que ha introducido el usuario
//        . Cuando consiga adivinarlo
//        , debe indicárselo e imprimir en pantalla el número de veces que el usuario ha intentado adivinar el número
//        . Si el usuario introduce algo que no es un número, se debe controlar esa excepción e indicarlo por pantalla
//        . En este último caso también se debe contar el carácter fallido como un intento
        Scanner leer = new Scanner(System.in);
        System.out.println("***** JUEGO DE ADIVINANZA *****");

        int numAleatorio = (int) (Math.random() * 500 + 1);
        int intentosRealizados = 0;
        System.out.println("El número generado es: " + numAleatorio);

        

        try {
            System.out.println("Ingresá el número que crees que salió en la lotería (1 al 500). Solo tenés 10 intentos.");

        for (int i = 0; i < 10; i++) {
            int numIngresado = leer.nextInt();

            if (numIngresado < numAleatorio) {
                System.out.println("El número es mayor...");
            } else {
                System.out.println("El número es menor...");
            }

            if (numIngresado == numAleatorio) {
                System.out.println("Felicitaciones, adivinaste");
            } else {
                intentosRealizados++;
                System.out.println("Vuelve a intentarlo. Cantidad de intentos: " + intentosRealizados);
            }
        }

        } catch (Exception e) {
            System.out.println("El valor ingresado no corresponde con un número.");
        }

    }

}
