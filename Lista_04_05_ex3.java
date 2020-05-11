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
public class Lista_04_05_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner gg = new Scanner(System.in);
                
        int numero;
        
        System.out.println("Digite um número para ver sua tabuada:");
        numero = gg.nextInt();
        
        System.out.println("A tabuada do "+numero+" é:");
            //IMPRESSÃO DA TABUADA
            System.out.println(numero * 1);
            System.out.println(numero * 2);
            System.out.println(numero * 3);
            System.out.println(numero * 4);
            System.out.println(numero * 5);
            System.out.println(numero * 6);
            System.out.println(numero * 7);
            System.out.println(numero * 8);
            System.out.println(numero * 9);
            System.out.println(numero * 10);
            
    }
    
}
