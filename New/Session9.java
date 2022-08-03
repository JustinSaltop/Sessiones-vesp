
package New;
// Programa Que me permita validar el lugar de votacion, 
//la edad, la mesa de un proceso de eleccion
public class Session9 {

    public static void main(String[] args) {
 boolean lugardevotacion= true ;
 boolean edad = false;
 boolean mesa = false;
 
if (lugardevotacion==true){
    if (edad==true){
        if(mesa==true){
            System.out.println("Cumple con todos los requisitos necesario para poder realizar su votacion");
        }else{
            System.out.println("No se encuentra ubicado en la mesa para realizar el proceso de sufragio");
        }
    }else{
        System.out.println("No cumple con la edad para poder realizar el proceso de electoral ");
    }
}else{
     System.out.println("NO se encuentra en el lugar de sufragio designado ");
}

        
        
        
//	 for (int i = 1; i <= 5; i++) {
//      System.out.println("Tabla de multiplicar del numero " + i);
//            for (int j = 0; j <=10; j++) {
//            System.out.println(i  + " X " + j + " =" + i*j);
//		}
//	}
}
    }
    
