package Day2;

import java.util.Scanner;

public class Reverse {
    public static void reverse(int n){
        int rev = 0;
        while(n!=0){
            int a = n%10;
            rev = rev*10+a;
            n = n/10;
        }
        System.out.println("The Reverse Of a Number is: "+rev );

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        reverse(n);
        sc.close();
        
    }
}
