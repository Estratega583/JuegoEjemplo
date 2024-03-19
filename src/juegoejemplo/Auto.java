
package juegoejemplo;

import javax.swing.JOptionPane;


public class Auto {
    private String color;
    private boolean chocado;
    private int posX;
    private int posY;

    public Auto(String color, int posX, int posY) {
        this.color = color;
        this.posX = posX;
        this.posY = posY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isChocado() {
        return chocado;
    }

    public void setChocado(boolean chocado) {
        this.chocado = chocado;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }
    
    public void moverArriba(){
    
        if(!chocado && posY > 0){
             posY=posY-1;
             System.out.println("Pos Y "+posY);
        
        }else {
        
            JOptionPane.showMessageDialog(null, "no se puede mover");
        }
       
    }
    
    public void moverAbajo(){
    
        if(!chocado && posY < 22){
             posY=posY+1;
             System.out.println("Pos Y "+posY);
        
        }else {
        
            JOptionPane.showMessageDialog(null, "no se puede mover");
        }
       
    }
    
    public void moverDerecha(){
    
        if(!chocado && posX <80 ){
        
            posX=posX+1;
            System.out.println("Pos X "+posX);
        }else {
        
             JOptionPane.showMessageDialog(null, "no se puede mover");
        }
    }
    
     public void moverIzquierda(){
    
        if(!chocado && posX > 0 ){
        
            posX=posX-1;
            System.out.println("Pos X "+posX);
        }else {
        
            JOptionPane.showMessageDialog(null, "no se puede mover");
        }
    }
}
