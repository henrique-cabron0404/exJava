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
public class Aula_05_07_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner user = new Scanner(System.in);
        
        String nomes[] = new String[5];
        
        for(int i = 0; i < nomes.length; i++){
            System.out.println(i+1+": ");
            nomes[i] = user.next();
        }
        for(int j = 0; j < nomes.length; j++){
            System.out.println(j+1+": "+nomes[j]);
        }
        
    }
    
}
