
package New;

public class PRUEBA {

    public static void main(String[] args) {
      //Entrada
      String empleado="JADEN PLUAS";
      String cargo ="ADMINISTRADOR";
      double pagoHora= 15.0;
      int numeroHoras=160;
      double sueldo = 0.0;
      double iees= 0.0;
      double netoRecibir= 0.0;
      //proceso
      sueldo=pagoHora*numeroHoras;
      iees = sueldo*0.095;
      netoRecibir=sueldo-iees;
      //Salida
      System.out.println("Empleado" +empleado);
      System.out.println("Cargo " +cargo);
      System.out.println("Sueldo: " +sueldo );
      System.out.println("Descuento para el IEES: "+iees);
      System.out.println("El neto a recibir es de : " +netoRecibir);
      
    }
    
}
