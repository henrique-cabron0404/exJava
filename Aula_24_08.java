/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosAulasQuarentena;
import javax.swing.JOptionPane;

/**
 *
 * @author Henrique
 */
public class Aula_24_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome, endereco;
        int idade, resposta;
        String quebraLinha = System.getProperty("line.separator");
        
        //janela pedindo o nome
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        
        endereco = JOptionPane.showInputDialog("Qual seu endereço?");
        
        //janela única para a confirmação de todos os dados acima
        
        resposta = JOptionPane.showConfirmDialog(null, "Seu nome é "+nome+"."+quebraLinha+"Sua idade é: "+idade+"."+quebraLinha+"Seu endereço é: "+endereco+"."+quebraLinha+quebraLinha+"Esses dados estão corretos?");
        
        //if e else para confirmação da resposta anterior
        
        if(resposta==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null, "Dados não confirmados.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Bem vindo(a) "+nome+"!");
        }
    }
    
}
