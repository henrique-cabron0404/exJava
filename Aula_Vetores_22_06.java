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
public class Aula_Vetores_22_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner gg = new Scanner(System.in);
        
        int vetor[] = new int[10];
        
        for(int i = 0; i < vetor.length; i++){
        vetor[i] = gg.nextInt();
        }
                
        for(int j = 0; j < vetor.length; j++){
            System.out.print("|"+vetor[j]+"| ");}
        
        vetor [4] = 87;
        vetor [2] = 57;
        
        System.out.println("");
        System.out.println("Quinta posição: "+vetor[4]);
        System.out.println("Terceira posição: "+vetor[2]);
        
    }
    
}
