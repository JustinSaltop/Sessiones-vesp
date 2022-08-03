
package New;

import javax.swing.JOptionPane;

public class Session14 {

    public static void main(String[] args) {
//     String s1 = "HOLA CON TODO USTEDES ,QUE TAL ? ";
//        //returns the char value at the 1 index
//       System.out.println("WL caracter 1Th es : " + s1.charAt(1));
//     //returns the char value at the 5th index
//       System.out.println("El caracter de la 5TH es : " + s1.charAt(5));
//      //returns the char value at the 25th index
//        System.out.println("EL caracter de la 25TH es : " + s1.charAt(25));
//   //returns the char value at the 23th index
//    char result = s1.charAt(2);
//      System.out.println("Caracter de del 23Th es : " + result); 
       //ENTRADA
       String palabra=" ";
       int longitud=0;
       int contadorVocales=0;
       int contadorConsonantes=0;
//PROCESO
palabra=JOptionPane.showInputDialog("Ingrese una palabra ");
 longitud = palabra.length();
 for(int i=0;i<longitud;i++){
     if(palabra.charAt(i)=='a'||palabra.charAt(i)=='e'||
             palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||
             palabra.charAt(i)=='u'){
         contadorVocales++;
     }else{
         contadorConsonantes++;
     }
 }
 //SALIDA
        JOptionPane.showMessageDialog(null,"La cantidad de vocales es: "+contadorVocales);
 JOptionPane.showMessageDialog(null, "La cantidad de Consonantes son: "+contadorConsonantes);

    }
    
}
