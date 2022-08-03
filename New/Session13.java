
package New;

//import java.util.Scanner;

import javax.swing.JOptionPane;


public class Session13 {
    
    public static void main(String[] args) {
//        //SENTENCIA FOR
//        int numero;
//        Scanner Entrada = new Scanner(System.in);
//         System.out.println("Ingrese un numero : ");
//  numero=Entrada.nextInt();
//        System.out.println("Tabla de multiplicar del " +numero);
// for (int i =0 ; i <= 12; i++) {
// System.out.println(numero + " * " + i + " = " + numero*i );
// } 
      //ENTRADA 
      char sexo ='M';
       String numeroEnteroString="10";
      String numeroDecimalString="12.5";
      int numeroEnteroConvertido= 0 ;
      double numeroDecimalConvertido=0.0;
      String sexoStringConvertido =" ";
      int Opcion=0;
      //Proceso
     Opcion=Integer.parseInt( JOptionPane.showInputDialog(null,"Menu de Opciones" +" \n"+
              "1.Convertir de String a Entero"+"\n"+
              "2.Convertir de String a Double"+"\n"+
              "3.Convertir de char a String"));
     if(Opcion==1){
         numeroEnteroConvertido=Integer.parseInt(numeroEnteroString);
      JOptionPane.showInputDialog(null,"    La conversion es : "+numeroEnteroConvertido);
     }else if(Opcion==2) {
              numeroDecimalConvertido=Double.parseDouble(numeroDecimalString);
              JOptionPane.showInputDialog(null,"La Conversion es : "+numeroDecimalConvertido);
              
     }else if ((Opcion==3)){
          sexoStringConvertido=String.valueOf(sexo);
          JOptionPane.showInputDialog(null,"La Conversion es: " +sexoStringConvertido);
          
          
     }
      
    }
    
}
