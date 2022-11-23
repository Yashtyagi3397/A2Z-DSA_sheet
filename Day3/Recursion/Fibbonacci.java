package Day3.Recursion;

import java.util.Scanner;

public class Fibbonacci {
    static int  fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return  fib(n-1)+fib(n-2);
    }
    static void check(int n){
        if(n==0){
            System.out.println(0);
            // System.out.println(1);
            return;
        }
        check(n-1);
            System.out.println(fib(n));


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        check(n); 
        sc.close();
    }
}
