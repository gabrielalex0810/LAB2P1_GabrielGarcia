
package lab2p1_gabrielgarcia;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Lab2P1_GabrielGarcia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        //lectura
        Scanner leer=new Scanner(System.in);
        System.out.println("*****MENU*****");
        System.out.println("1. Ejercicio Dibujando Triangulos ");
        System.out.println("2. Ejercicio Area de Figuras ");
        System.out.println("3. Ejercicio Evaluando Numeros ");
        System.out.println("4. Salir del programa ");
        System.out.println("Ingrese su opcion");
        opcion=leer.nextInt();
        
        
        while (opcion<5&&opcion>0){
            if (opcion==1){
                System.out.println("Ingrese longitudes del triangulo (A,B,C)");
                System.out.println("Ingrese longitud A ");
                int long_A=leer.nextInt();
                System.out.println("Ingrese longitud B ");
                int long_B=leer.nextInt();
                System.out.println("Ingrese longitud C ");
                int long_C=leer.nextInt();
                
                if (long_A>=0&&long_B>=0&&long_C>=0){
                    
                    if (long_A+long_B>long_C&&long_A+long_C>long_B&&long_B+long_C>long_A){
                        System.out.println("Las longitudes ingresadas forman un triangulo ");
                    }//Fin 2 longitudes mayor que 3er longitud
                    
                    else
                        System.out.println("Las longitudes ingresadas NO forman un traingulo");
                }//Fin mayor o iguales a 0    
                
                else
                    System.out.println("Las longitudes no pueden ser negativas ");
            }//Fin opcion 1
            
            if (opcion==2){
                System.out.println("Ingrese el tipo de figura que desee calcular el area: ");
                System.out.println("1. Rectangulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Circulo");
                System.out.println("Ingrese su opcion");
                int figura=leer.nextInt();
                
                while (figura<4&&figura>0){
                    if (figura==1){
                        System.out.println("Ingrese el valor de la base del rectangulo");
                        double baserect=leer.nextDouble();
                        System.out.println("Ingrese el valor de la altura del rectangulo");
                        double alturarect=leer.nextDouble();
                        
                        System.out.println("El area del rectangulo es de "+baserect*alturarect+" unidades cuadradas");   
                       
                    }//Fin Figura 1
                    if (figura==2){
                            System.out.println("Ingrese el valor de la base del triangulo");
                            double basetri=leer.nextDouble();
                            System.out.println("Ingrese el valor de la altura del triangulo");
                            double alturatri=leer.nextDouble();
                            
                            System.out.println("El area del triangulo es de "+0.5*basetri*alturatri+" unidades cuadradas");
                            
                    }//Fin Figura 2
                    
                    if (figura==3){
                        System.out.println("Ingrese el valor del radio del circulo");
                        double radio=leer.nextDouble();
                
                        System.out.println("El area del circulo es de "+3.14159265359*radio*radio+" unidades cuadradas");
                        
                    }//Fin figura 3
                    System.out.println("Desea calcular otra figura?");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    System.out.println("Ingrese su opcion:");
                    int otrafigura=leer.nextInt();
                    
                    while(otrafigura==1){
                        System.out.println("Ingrese el tipo de figura que desee calcular el area: ");
                        System.out.println("1. Rectangulo");
                        System.out.println("2. Triangulo");
                        System.out.println("3. Circulo");
                        System.out.println("Ingrese su opcion");
                        figura=leer.nextInt();
                    }//Fin otra figura
                   
                  
                }//Fin while Figuras
                   
            }//Fin opcion 2
           
                
            
        }//Fin del while principal
        
                
    }//Fin de main
    

}//Fin de public class
