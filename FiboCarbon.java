package rpl;

import java.util.Scanner;
 
public class FiboCarbon {
 
    @SuppressWarnings("resource")
    public static void main(String args[]) {
 
        System.out.print("Masukkan angka: ");
        int angka = new Scanner(System.in).nextInt();
 
        System.out.println("Angka fibonaci " + angka +" a : ");

        for(int i=1; i<=angka; i++){
            System.out.print(fibonacciRecusion(i) +" ");
        }
    } 
 
    public static int fibonacciRecusion(int angka){
        if(angka == 1 || angka == 2){
            return 1;
        }
 
        return fibonacciRecusion(angka-1) + fibonacciRecusion(angka -2); 
    }
 
    public static int fibonacciLoop(int angka){
        if(angka == 1 || angka == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= angka; i++){
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
    }     
}