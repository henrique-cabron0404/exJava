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
public class Aula_05_07_exbonus {

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
        for(int j = numeros.length - 1; j >= 0; j--){
            System.out.println(j+1+": "+numeros[j]);
        }
        
        /* o segundo For para impressão do vetor do final para o começo
        coloquei a variável para correr os índices como J
        valendo o valor total do vetor numeros - 1
        pois como percorre de 0-9, o valor do tamanho seria o que coloquei entre []
        e não tem o 10, somente abaixo do 9, por isso que ficou numeros.length - 1
        
        ficou j >= 0 pois o J só pode ser maior ou igual a 0, não temos índice -1
        
        j-- porque quero percorrer ao contrário, então se começa com 9, tenho que diminuir
        como o j++ iria somar um a J, o j-- irá diminuir 1 a J, assim chegando no 0, e imprimindo ao contrário
        :)
        */
    }
    
}
