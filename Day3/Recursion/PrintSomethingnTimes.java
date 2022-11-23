package Day3.Recursion;

import java.util.Scanner;

public class PrintSomethingnTimes {
    static void print(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");
        print(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
        sc.close();

        
    }
}
