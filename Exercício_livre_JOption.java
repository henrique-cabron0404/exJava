/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigosAulasQuarentena;

import javax.swing.JOptionPane;

/**
 *
 * @author henri
 */
public class Exercício_livre_JOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome, resposta;
        int choro;
        
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
                
        JOptionPane.showMessageDialog(null, nome+", ATENÇÃO, você deverá escolher um carro.", "PRESTA ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "ESCOLHA COM CAUTELA!", "ALERTA", JOptionPane.WARNING_MESSAGE);
        
        Object[] carros = { "ONIX" , "SPIN" , "MAREA" , "UP" , "HILUX" , "RAM 2500" , "COROLLA" , "TORO" , "DOBLO", "UNO", "208"};
        Object selectedValue = JOptionPane.showInputDialog(null, "Escolha com sabedoria um carro", "Opção", JOptionPane.QUESTION_MESSAGE, null , carros, carros[0]);
  
        //testei para ver se o valor selecionado é por número ou pelo nome, nesse caso é pelo nome, GG EZ System.out.println(selectedValue);
        
        if(selectedValue == "ONIX"){
            JOptionPane.showMessageDialog(null, "Parabéns "+nome+", seu Onix de firma pegou fogo!", "Péssima escolha", 0);
        }
        
            else if(selectedValue == "SPIN"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", seu táxi capivara em forma de geladeira chegou!", "Escolha fria e natural", 2);
            }
        
            else if(selectedValue == "MAREA"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", sua bomba, conhecida como Marea, explodiu o motor!", "Pior que Onix", 0);
            }
        
            else if(selectedValue == "UP"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", seu 'esportivo' bateu de frente porque não faz curva.", "Juvena demaixxx", 2);
            }
        
            else if(selectedValue == "HILUX"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", sua Tombalux capotou, aí sim hein!", "Beber cair levantar", 0);
            }
           
            else if(selectedValue == "RAM 2500"){
                JOptionPane.showMessageDialog(null, "PARABÉNS, você escolheu com sabedoria, você é um verdadeiro AGROBOY ou uma verdadeira AGROGIRL!!!", "JACKPOT", 1);
            }
        
            else if(selectedValue == "COROLLA"){
                JOptionPane.showMessageDialog(null, "PARABÉNS "+nome+", você já passou dos 50, aproveite os netinhos", "TIOZÃO", 1);
            }
        
            else if(selectedValue == "TORO"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", seu carrinho de brinquedo atolou na rampa do Shopping!", "HAHA", 2);
            }
        
            else if(selectedValue == "DOBLO"){
                JOptionPane.showMessageDialog(null, "PARABÉNS "+nome+", seus Pets podem ir tranquilos ao PetShop!", "CARRO DO PETZ?", 3);
            }
        
            else if(selectedValue == "UNO"){
                JOptionPane.showMessageDialog(null, "UAAAU. "+nome+", seu Uno de firma com ESCADA NO TETO passou todos, até o Barrichelo, KATCHAUUUUUUU", "1º LUGAR", JOptionPane.WARNING_MESSAGE);
            }
        
            else if(selectedValue == "208"){
                JOptionPane.showMessageDialog(null, "Parabéns "+nome+", você está com a maldição do 'pejô', não vai conseguir vender pelos próximos 15 anos", "E T E R N I D A D E", JOptionPane.WARNING_MESSAGE);
            }
        
        Object[] chorolivre = { "BUAA PARA DE FALAR DO MEU CARRO", "NÃO", "TUDO TRALHA", "AQUI É AGROBOY"};
            choro = JOptionPane.showOptionDialog(null, "Você se ofendeu?", "O CHORO É LIVRE",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, chorolivre, chorolivre[0]);
                // já descobri que é classificado em número System.out.println(choro);
                
                if(choro == 0){
                    JOptionPane.showMessageDialog(null, "Aceita, teu carro não presta.", "CHORA", 0);
                }
                
                else if(choro == 1){
                    JOptionPane.showMessageDialog(null, "Tá, mas tu não é agroboy.", "ENTRETANTO", 2);
                }
                
                else if(choro == 2){
                    JOptionPane.showMessageDialog(null, "Só a RAM que é boa, vida longa aos agroboy's!", "meio certo", 3);
                }
                
                else if(choro == 3){
                    JOptionPane.showMessageDialog(null, "Ó MINHA DIVINDADE!", "ACERTÔ MISERAAAVI", 1);
                }
    }
    
}
