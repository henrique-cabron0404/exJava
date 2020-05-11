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
public class Lista_04_05_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner gg = new Scanner(System.in);
        //EXERCÍCIO 1
        String nome;
        
        System.out.println("Digite seu nome: ");
        nome = gg.next();
        
        System.out.println("Olá "+nome+", seja bem vindo(a)!");
    }
    
}
