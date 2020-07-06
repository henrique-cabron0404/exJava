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
public class aula_05_07_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user = new Scanner(System.in);
        
        Double numeros[] = new Double[10];
        
        for(int i = 0; i < numeros.length; i++){
            System.out.println(i+1+":");
            numeros[i] = user.nextDouble();
        }
        for(int j = 0; j < numeros.length; j++){
            System.out.println(j+1+": "+numeros[j]);
        }
    }
    
}
