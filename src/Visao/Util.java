package Visao;

public class Util {
    //grava os caracteres
    public static void ClearConsole(){
        System.out.print("\033[H\033[2J");   
        System.out.flush();        
    }
}
