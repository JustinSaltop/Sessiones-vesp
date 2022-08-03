
package New;

import javax.swing.JOptionPane;


public class Session18 {

  
    public static void main(String[] args) {
        //ENTRADA
        String celular=" ";
        int longitud=0;
        //PROCESO
        celular=JOptionPane.showInputDialog("Ingrese su numero de celular ");
        longitud=celular.length();
        //
        for(int i=0;i<longitud;i++){
            if(celular.charAt(i)=='0'||celular.charAt(i)=='1'||celular.charAt(i)=='2'||
                    celular.charAt(i)=='3'||celular.charAt(i)=='4'||celular.charAt(i)=='5'||
                    celular.charAt(i)=='6'||celular.charAt(i)=='7'||celular.charAt(i)=='8'||
                    celular.charAt(i)=='9'){
            }else{
                JOptionPane.showMessageDialog(null, "El numero ingresado NO esta correcto ");
                i=longitud;
            }
        }
    }
    
}
