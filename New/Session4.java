
package New;
public class Session4 {

    public static void main(String[] args) {
      int numero1 = 8;
      int numero2=10;
      int residuo1=0;
      int residuo2=0;
      //Proceso
      residuo1=numero1%2;
      residuo2=numero2%2;
      //Salida
      if (residuo1==0 && residuo2==0){
          System.out.println("Los dos numeros son pares");
      }else{
          System.out.println("Los dos numero no son pares");
      }
    }
    
}
