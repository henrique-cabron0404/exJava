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
public class Lista_04_05_ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner gg = new Scanner(System.in);
        
        double mi, km;
        
        System.out.println("Insira a quantidade em quilômetros:");
        km = gg.nextDouble();
        
        mi = (km / 1.60934);
        
        System.out.println(km+" quilômetros equivale à "+mi+" milhas.");
    }
    
}
