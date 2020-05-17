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
public class Aula_11_05_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner gg = new Scanner(System.in);
        
        int ano;
        String aninho;
        
        System.out.println("Digite um ano (de 1000 - 9999):");
        ano = gg.nextInt();
        
        aninho = ""+ano;
        
        if(aninho.length() != 4){
            System.out.println("Insira um ano válido, no formado ####");}
        else if(ano > 2020){
            System.out.println(ano+" é do futuro");}
        else if(ano < 2020){
            System.out.println(ano+" é do passado");}
        else if(ano == 2020){
            System.out.println(ano+" é o ano atual");}
    }
    
}