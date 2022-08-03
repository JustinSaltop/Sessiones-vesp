
package New;

import javax.swing.JOptionPane;

public class Session20 {

    public static void main(String[] args) {
        //ENTRADA
        int numero =6;
        int antecesores=0;
        int acumuladordivisible=0;
        // PROCESO
        antecesores=numero-1;
        while(antecesores>0){
            if(numero%antecesores==0){
                acumuladordivisible=acumuladordivisible+antecesores;
            }
            antecesores--;
        }
        if(numero==acumuladordivisible){
           JOptionPane.showMessageDialog(null,"Es Perfecto");
        }else{
            JOptionPane.showMessageDialog(null,"No es Perfecto");
        }
    }
    
}
