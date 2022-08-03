
package New;

import java.util.Scanner;

public class Session10 {

    public static void main(String[] args) {
  //Entrada
  Scanner Entrada = new Scanner(System.in);
  String producto="";
  int cantidad=0;
  double precio= 0.0;
  double subtotal =0.0;
  double iva = 0.0;
  double total = 0.0;
  //Proceso 
  System.out.println("Ingrese el Producto : ");
  producto=Entrada.next();
  System.out.println("Cantidad: ");
  cantidad=Entrada.nextInt();
  System.out.println("Precio = ");
  precio=Entrada.nextDouble();
  subtotal = cantidad*precio;
  iva = subtotal *0.12;
  total =subtotal+iva;
  //Salida
  System.out.println("Producto: "+producto);
  System.out.println("Subtotal: "+subtotal);
  System.out.println("Iva del 12%: " +iva );
  System.out.println("Cantidad a pagar : " +total);
  
    }
 
  
    }
    

