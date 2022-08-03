
package New;

import javax.swing.JOptionPane;

public class Session12 {

       
    public static void main(String args[]) {
//        
              String numeroEnteroString="10";
      String numeroDecimalString="12.5";
      int numeroEnteroConvertido= 0 ;
      double numeroDecimalConvertido=0.0;
      //PROCESO
        numeroEnteroConvertido=Integer.parseInt(numeroEnteroString);
        numeroDecimalConvertido=Double.parseDouble(numeroDecimalString);
        //SALIDA
        JOptionPane.showMessageDialog(null,"El numero Convertido es " +numeroDecimalConvertido);
        JOptionPane.showMessageDialog(null,"El numero Convertido es " +numeroEnteroConvertido);
               
    }
}

    
