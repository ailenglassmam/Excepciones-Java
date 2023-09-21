package Entities;

public class Dato {
    //creo un atributo de tipo array de strings y le doy un tamaño
    private String[] listado = new String[5];

    public Dato() {
    }

    public Dato(String[] listado) {
        this.listado = listado;
    }

    public String[] getListado() {
        return listado;
    }

    public void setListado(String[] listado) {
        this.listado = listado;
    }
    
    //Creo un método que luego llamo en el main
    public void agregarDatos(){
        listado[0] = "Lunes";
        listado[1] = "Martes";
        listado[2] = "Miercoles";
        listado[3] = "Jueves";
        listado[4] = "Viernes";
        //Hago una prueba: agrego un día más al listado para probar el manejo de errores
//        listado[5] = "Sabado";
        
        for (String string : listado) {
            System.out.println("Día: " + string);
        }
    }
}
