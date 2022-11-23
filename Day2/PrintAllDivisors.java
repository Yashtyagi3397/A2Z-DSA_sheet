package Day2;

import java.util.Scanner;

public class PrintAllDivisors {
    static void printDiv(int n){
        System.out.println("All Divisors are as Follows: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDiv(n);
        sc.close();
        
    }
}
