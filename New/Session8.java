
package New;

public class Session8 {

    public static void main(String[] args) {
       //Entradas
       String Vehiculo="FORD-F150";
       boolean licencia = false;
       boolean efectivo=true;
       
       //Proceso
       if(licencia== true){
           if(efectivo==true){
             //salida
             System.out.println("Se ejecuta la venta del vehiculo : " +Vehiculo);
           }else{
               System.out.println("Cumple con la licencia , pero no cumple con el efectivo , no se ejecuta la venta");
           }
            }else{
                 System.out.println("No cumple con el requisito principal (LICENCIA)");
       }
    }
    
}
