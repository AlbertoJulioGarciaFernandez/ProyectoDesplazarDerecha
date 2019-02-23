package proyectodesplazardcha;
import java.util.Scanner;
/**
 *  **PRO (UT6) - Ejercicios**
 * 3.- Desplazar_derecha: Realizar un programa que desplace hacia la derecha a 
 * los elementos de un array, el array tendrá un número n de elemento a decidir 
 * por el usuario. Cuando se desplaza hacia la derecha el último valor se perderá
 * 
 * @author Alberto Julio García Fernández
 */
public class ProyectoDesplazarDcha {    
    public static void main(String[] args) {        
        int num, pos, n, aux;
        Scanner sc;
        sc=new Scanner(System.in);
        
        System.out.println("\t**EJERCICIO 3 - DESPLAZAMIENTO ELEMENTOS A LA "
                + "DERECHA**");
        System.out.println("Por favor, introduzca el número de elementos que "
                + "desea que tenga su array:");
        num=sc.nextInt();
        
        //Bloque de validación:
        while(num<0){
            System.out.println("Se ha producido un error");
            System.out.println("Por favor, introduzca un número de elementos mayor "
                + "que cero:");
            num=sc.nextInt();
        }
        
        int[] array;//Definición de variable de tipo Array        
        array=new int[num];//Creación de un objeto de la clase Array
        
        System.out.println("Ahora, por favor, rellene el array con valores "
                + "enteros:");
        for(pos=0;pos<array.length;pos++){
            System.out.print("Posición "+(pos+1)+"-> ");
            array[pos]=sc.nextInt();
        }
        
        System.out.println("El array (sin tratar) es el siguiente:");
        for(pos=0;pos<array.length;pos++){
            System.out.println("Posición "+(pos+1)+"-> "+array[pos]);         
        }        

        for(pos=array.length-1;pos>0;pos--){/*Vamos recorriendo el array desde 
            su final (posición length-1), hasta la primera posición (0), y substituyendo 
            el elemento de la posición en la que nos encontremos, con el elemento 
            de la posición pos-1*/                                  
            array[pos]=array[pos-1];            
            
            if(pos==1){/*Cuando lleguemos a la posición 1, substituiremos 
                el valor del primer elemento (pos=0) con un cero, ya que si no, los 
                valores de las posiciones pos=0 y pos=1 saldrían repetidos:*/
                array[pos-1]=0;
            }
        }                                               
        
        System.out.println("El array ha quedado de la siguiente manera (el último "
                + "elemento se ha perdido como consecuencia del desplazamiento a "
                + "la derecha de los elementos):");
        for(pos=0;pos<array.length;pos++){
            System.out.println("Posición "+(pos+1)+"-> "+array[pos]);         
        }
    }    
}
