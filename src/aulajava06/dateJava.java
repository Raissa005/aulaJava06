
package aulajava06;

import java.util.Calendar;
import javax.swing.JOptionPane;

public class dateJava {
    public static void main(String[] args){
        
        String r = JOptionPane.showInputDialog("Digite sua data");
        String[] resp = r.split("/");

          int ano = Integer.parseInt(resp[2]);
          int mes = Integer.parseInt(resp[1])-1;
          int dia = Integer.parseInt(resp[0]);
          Calendar c = Calendar.getInstance();
          
          c.set(ano, mes, dia);
          
          JOptionPane.showConfirmDialog(null,  c.getTime());
                  }
}
