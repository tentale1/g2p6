import java.util.Scanner;

/**
 * Programa para hallar numero mayor y menor y calcular supromedio
 * 
 * @author Carlos Alvarez 
 * @version 20190817
 */
public class menor_mayor
{
    public static void main(String[] args) {
       
        Scanner Teclado = new Scanner(System.in);
        int n, max, min, sum=0;
        float prom;
       
        System.out.print("ingrese la cantidad de elementos: ");
        n = Teclado.nextInt();
        
        System.out.print("ingrese los números del arreglo: ");
        
        int array [] = new int [n];
        
        for (int i = 0; i < n; i++) {
            array [i] = Teclado.nextInt();
        }
       
        min = max = array[0];
        
        for (int j = 1; j < n; j++) {
            if(array[j] > max) {
                max = array[j];
            }
            if(array[j]<min) {
                min = array[j];
            }
        }
        
        for (int i=0; i<array.length; i++) {
            sum += array[i];
        }
        
        prom = (sum/array.length);
        
        
        System.out.println("El mayor valor es: " + max);
        System.out.println("El menor valor es: " + min);
        System.out.println("El promedio del arreglo es: " + prom);
    }
}