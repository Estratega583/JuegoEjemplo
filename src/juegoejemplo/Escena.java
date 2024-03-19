
package juegoejemplo;

import java.util.Scanner;


public class Escena {
    private Auto auto;
    private Pared pared;
    private int[][] pos = new int[80][22];
    
    public Escena(Auto auto){
            this.auto=auto;
            this.pared=new Pared();
            for(int i = 0;i < 80;i++){
                for(int j = 0;j < 22;j++){
                    pos[i][j] = 0;
                }
            }
            for(int i = 0;i <= 4;i++){
                for(int j = 0;j <= 4;j++){
                    pos[pared.getPosX()+j][pared.getPosY()+i] = 1;
                }
            }
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }
    
    public int getPos(int i, int j){
        return pos[i][j];
    }
    
    public void jugar(){
        Scanner leer = new Scanner(System.in);
        String respuesta = "";
        while(!"E".equals(respuesta)){
            for(int j = -2;j < 3;j++){
                for(int i = -4;i < 5;i++){
                    if(i == 0 && j == 0){
                        if(pos[i+auto.getPosX()][j+auto.getPosY()] == 1){
                            System.out.print("*");
                        }else
                        System.out.print("A");
                    }else{
                        if(j+auto.getPosY() < 0 || i+auto.getPosX() < 0){
                            System.out.print("x");
                        }else{
                            System.out.print(pos[i+auto.getPosX()][j+auto.getPosY()]);
                        }
                    }
                }
                System.out.println("");
            }
            respuesta = leer.next().toUpperCase();
            if(auto.isChocado() == false){
                if(getPos(auto.getPosX(),auto.getPosY()) == 0){
                    switch(respuesta){
                        case "A":
                            auto.moverIzquierda();
                            break;
                        case "S":
                            auto.moverAbajo();
                            break;
                        case "D":
                            auto.moverDerecha();
                            break;
                        case "W":
                            auto.moverArriba();
                            break;
                        case "E":
                            break;
                        default:
                            System.out.println("Respuesta inválida.");
                    }
                }else{
                    System.out.println("El auto chocó.");
                    auto.setChocado(true);
                }
            }else{
                System.out.println("El auto está chocado.");
            }
            if("E".equals(respuesta)){
                System.out.println("Saliendo del juego.");
            }
        }
        //Utilizando Scanner
        //A ---Izquierda
        //S---Abajo
        //D--Derecha
        //W---Para arriba
        //E..Salir del juego
        //si el auto choca con la pared, el auto queda chocado.
    }
    
}
