
package New;

import javax.swing.JOptionPane;

public class Session15 {

    public static void main(String[] args) {
        // TODO code application logic here
      //ENTRADA
      int numero=0;
      int opcion=0;
      //proceso
    opcion=Integer.parseInt(JOptionPane.showInputDialog("-----Menu de Opciones -------"+"\n"
            +"1.GENERA SECUENCIA ASCENDENTE"+"\n"+
            "2.GENERA SECUENCIA DESCENDENTE "));
     numero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "));
     //salida 
     switch(opcion){
         case 1 -> {
             for (int indice=numero+1;indice>0;indice++){
                 JOptionPane.showMessageDialog(null,". "+indice);
             }
            }
         case 2 -> {
             for (int indice=numero-1;indice>0;indice--){
                 JOptionPane.showMessageDialog(null,". "+indice);}
            }
     }
      

    }
    
}
