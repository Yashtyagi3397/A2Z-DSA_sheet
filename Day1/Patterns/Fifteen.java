package Patterns;

import java.util.Scanner;

public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        char a = 65;
        for(int i=0;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(a);
                a++;
            }
            a=65;
            System.out.println();
        }
        sc.close();
    }
}
