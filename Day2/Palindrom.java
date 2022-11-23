package Day2;

import java.util.Scanner;

public class Palindrom {
    public static void checkpalindrom(int n){
        int rev =0,co_n = n;
        while(n!=0){
            int a = n%10;
            rev = rev*10+a;
            n = n/10;
        }
        if(rev == co_n){
            System.out.println("The Given Number is Palindrom");
        }
        else{
            System.out.println("The Given Number is Not Palindrom");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        checkpalindrom(n);
        sc.close();
        
    }
    
}
