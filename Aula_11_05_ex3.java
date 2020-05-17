/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package codigosAulasQuarentena;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author Henrique
 */
public class Aula_11_05_ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner gg = new Scanner(System.in);
        
        String nome;
        double nota1, nota2, media;
        
        System.out.println("Digite seu nome:");
        nome = gg.nextLine();
        
        System.out.println("Digite sua primeira nota:");
        nota1 = gg.nextDouble();
        
        System.out.println("Digite sua segunda nota:");
        nota2 = gg.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        DecimalFormat df = new DecimalFormat("0.##");
        String dx = df.format(media);
        
        if(media <= 3.99){
            System.out.println(nome+", sua média é:");
            System.out.print(dx);
            System.out.println(" portanto foi REPROVADO.");
        }
        
        else if(media >= 4 && media <=5.99){
            System.out.println(nome+", sua média é:");
            System.out.print(dx);
            System.out.println(" portanto está de RECUPERAÇÃO.");
        }
        else{
            System.out.println(nome+", sua média é:");
            System.out.print(dx);
            System.out.println(" portanto foi APROVADO.");
        }
    }

}
