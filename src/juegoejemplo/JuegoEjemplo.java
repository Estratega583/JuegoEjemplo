
package juegoejemplo;


public class JuegoEjemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Auto ford = new Auto("rojo", 10,5);
        Escena escena1=new Escena(ford);
        escena1.jugar();
    }
    
}
