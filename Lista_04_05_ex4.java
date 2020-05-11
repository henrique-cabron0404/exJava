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
public class Lista_04_05_ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner gg = new Scanner(System.in);
        
        //EX PARA DESCOBRIR A ÁREA DE UM TRIÂNGULO
        
        float base, height, total;
        
        System.out.println("Digite a base do triângulo:");
        base = gg.nextFloat();
        
        System.out.println("Digite a altura do triângulo:");
        height = gg.nextFloat();
        
        total = (base * height) / 2;
        
        System.out.println("A área do triângulo é: "+total);
        
        System.out.println("------------QUADRADO---------------------------");
        
        //EX PARA DESCOBRIR A ÁREA DO QUADRADO
        
        double lado, area;
        
        System.out.println("Insira um lado do quadrado:");
        lado = gg.nextDouble();
        
        area = Math.pow(lado, 2);
        
        System.out.println("A área do quadrado é: "+area);
        
        System.out.println("------------IMC------------------------");
        
        //EX PARA DESCOBRIR O ÍNDICE DE MASSA CORPORAL (IMC)
        
        double peso, altura, imc;
        
        System.out.println("Insira o peso em quilogramas:");
        peso = gg.nextDouble();
        
        System.out.println("Insira a altura em metros:");
        altura = gg.nextDouble();
        
        imc = peso / Math.pow(altura, 2);
        
        System.out.println("O IMC é: "+imc);
    }
    
}
