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
public class Lista_04_05_ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner gg = new Scanner(System.in);
        
        //CADA MÊS SERÁ CONTADO COMO 30 DIAS  
        
        double meses, dias;
        
        System.out.println("Digite a quantidade de meses:");
        meses = gg.nextDouble();
        
        dias = meses * 30;
        
        if(meses > 1){
            System.out.println(meses+" meses equivalem a "+dias+" dias");}
        else{
            System.out.println(meses+" mês equivale a "+dias+" dias");}
    }
    
}
