
package New;

import javax.swing.JOptionPane;

public class Session19 {

    public static void main(String[] args) {
        //ENTRADA
        int numero=7;
        int antecesores=0;
        int residuo=0;
        int contadorDivisible=0;
        //PROCESO
        antecesores=numero-1;
        while(antecesores>1){
            if(numero%antecesores==0){
                contadorDivisible++;
            }
        }
        if(contadorDivisible==0){
            JOptionPane.showMessageDialog(null,"Es primo");
        }else{
            JOptionPane.showMessageDialog(null, "No es Primo ");
        }                
    }
    
}
