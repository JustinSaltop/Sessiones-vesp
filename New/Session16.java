
package New;

import javax.swing.JOptionPane;

public class Session16 {

    public static void main(String[] args) {
       //ENTRADA 
       String palabra= "";
       int longitud = 0;
       int indice =0;
       //PROCESO
       palabra= JOptionPane.showInputDialog("Ingrese una Palabra : ");
       longitud=palabra.length();
       do{
          JOptionPane.showMessageDialog(null,palabra.toUpperCase().charAt(indice));
          indice++;
       }while (indice<longitud);
    }

    
}
