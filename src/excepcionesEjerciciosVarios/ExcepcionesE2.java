package excepcionesEjerciciosVarios;

import Entities.Dato;

public class ExcepcionesE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancio la clase creada
        Dato nl = new Dato();
//        nl.agregarDatos();

//En el main manejo el posible error
        try{
            //Inserto el método en el try
            nl.agregarDatos();
        } catch(ArrayIndexOutOfBoundsException e){
            //En el catch paso el posible error que puede arrojar e imprimo por pantalla el mensaje
            System.out.println("El array excede su contenido. Solo admite " + e.getMessage());
        }
    }
    
}
