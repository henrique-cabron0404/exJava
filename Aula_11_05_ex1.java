/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosAulasQuarentena;
import java.util.Scanner;

/**
 *
 * @author Henrique
 */
public class Aula_11_05_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner gg = new Scanner(System.in);
        
        int numero, resto;
        
        System.out.println("Digite um número:");
        numero = gg.nextInt();
        
        resto = numero % 2;
        
        if(resto == 0){
            System.out.println(numero+" é um numero par.");}
        else{
            System.out.println(numero+" é um número ímpar.");}
    }
    
}
