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
public class Lista_04_05_ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner gg = new Scanner(System.in);
        
        String nome;
        float media, nota1, nota2, nota3, nota4;
        
        System.out.println("Insira o seu nome:");
        nome = gg.next();
        
        System.out.println("Digite a sua primeira nota:");
        nota1 = gg.nextFloat();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = gg.nextFloat();
        
        System.out.println("Digite a sua terceira nota:");
        nota3 = gg.nextFloat();
        
        System.out.println("Digite a sua quarta nota:");
        nota4 = gg.nextFloat();
        
        media = (nota1 + nota2 + nota3+ nota4) / 4;
        
        System.out.println(nome+", sua media final de matematica é: "+media);
    }
    
}
