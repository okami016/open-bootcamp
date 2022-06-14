/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package openbootcamp2;

import java.util.Scanner;
/**
 *
 * @author nando
 */
public class OpenBootcamp2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       // int numeroIf = sc.nextInt();
       // int numeroWhile = sc.nextInt();
        int numeroDoWhile = 4;
        
        
        /*
        if (numeroIf > 0){
            System.out.println("El " +numeroIf+ " es un número positivo");        
        }else if (numeroIf < 0){
            System.out.println("El " +numeroIf+ " es un número negativo");
        }else{
            System.out.println("El número introducido es 0");
        }*/
        
        /*
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }*/
        
        /*
        do{
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }while (numeroDoWhile < 3);
        */
        
        /*
        for (int numeroFor=0;numeroFor<=3;numeroFor++){
            System.out.println(numeroFor);
        }
        */
        
        System.out.println("Por favor, introduzca una estación: ");
        String estacion = sc.nextLine();
        switch (estacion){
            case "primavera":
                System.out.println("Estamos en primavera");
                break;
            case "verano":
                System.out.println("Estamos en Verano");
                break;
            case "otoño":
                System.out.println("Estamos en otoño");
                break;
            case "invierno":
                System.out.println("Estamos en invierno");
                break;
            default:
                System.out.println("Por favor, introduzca una estación valida");
        }
    }   
    
}
