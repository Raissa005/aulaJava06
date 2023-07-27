package aulajava06;

import javax.swing.JOptionPane;

public class AulaJava06 {

    public static void main(String[] args) {
         coletaDados();
    }

    public static void coletaDados(){
         Double [] [] matriz = new Double[5] [2]; 
          
          for (int i = 0; i < 5; i++ ){
               matriz[i][0] = Double.valueOf( JOptionPane.showInputDialog(null, "Qual a idade da "+(i+1)+"° pessoa?", "Idade", JOptionPane.INFORMATION_MESSAGE));
               matriz[0][i] = Double.valueOf (JOptionPane.showInputDialog(null, "Qual sua altura "+(i+1)+"° pessoa?", "altura", JOptionPane.INFORMATION_MESSAGE));
               
          }
          
          String s="";
          
          for(int i = 4; i > 0; i--){
              s+= (i+i)+"° pessoa tem idade = "+matriz[i][0]+" e altura = "+matriz[i][1]+".\n";
          }
          JOptionPane.showMessageDialog(null, s);
    }
    public static void tratamentoVirg(){       
    }
    
}


