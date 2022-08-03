
package New;

import javax.swing.JOptionPane;

public class Session17 {

    public static void main(String[] args) {
        // ENTRADA
        String palabra= "";
        int longitud=0;
        String palabranueva=" ";
        //Proceso
        palabra=JOptionPane.showInputDialog("Ingrese una palabra ");
        longitud=palabra.length();
        for(int i=longitud-1;i>=0;i--){
            palabranueva=palabranueva+palabra.charAt(i);
            
        }
        //Salida
        if(palabranueva.equals(palabra)){
            JOptionPane.showMessageDialog(null,"Es Palindroma");
        }else{
            JOptionPane.showMessageDialog(null, "No es Palindroma.");
        }
    }
    
}
