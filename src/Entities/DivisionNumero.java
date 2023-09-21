package Entities;

//Defina una clase llamada DivisionNumero. 


public class DivisionNumero {
    private int num1;
    private int num2;

    public DivisionNumero() {
    }

    public DivisionNumero(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void division(){
        int division = num1 / num2;
        
        if(num1 < num2){
            System.out.println("División por debajo de cero.");
        } else {
          System.out.println("La división da: " + division);  
        }
        
        
    }
}
