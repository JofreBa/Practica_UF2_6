/*
Escriu una funció “MCD_Euclides” que retorni el màxim comú divisor de dos
números segons l’algorisme d’Euclides.
 */

import java.util.Scanner;
public class exe5 {  
   
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in);
        int num1, num2;
        System.out.println(" Introdueix 1r numero: ");
        num1=scan.nextInt();
        System.out.println(" Introdueix 1r numero: ");
        num2=scan.nextInt();
        int res = gcd(num1, num2); 
        System.out.println(" El màxim comú divisor de dos números es : " + res);
    }  
   
    private static int gcd(int i, int j) {  
        int a, b, result;  
        // si m > n 
        if (i > j) {  
            a = i;  
            b = j;  
        } else {  
            a = j;  
            b = i;  
        }  
        // Troba el màxim comú divisor amb Algorisme d'Euclides
        result = a % b;  
        while (result != 0) {  
            a = b;  
            b = result;  
            result = a % b;  
        }  
        // Retorna el màxim comú divisor  
        return b;  
   
    }  
   
}