package juegoejemplo;

public class Pared {
    //La Pared tiene una dimensión 5 x 5
    private int posX;
    private int posY;
    public Pared() {
//        posX=(int)(Math.random()*75);
//        posY=(int)(Math.random()*17);
        posX = 12;
        posY = 7;
        System.out.println("Posición de la pared "+posX+" "+posY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
