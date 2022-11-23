package Patterns;

import java.util.Scanner;

public class TwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n-j);
            }
            for(int j=2;j<(2*n-2*i);j++){
                System.out.print(n-i);
            }
            for(int j=1;j<i;j++){
                System.out.print(n-i+j);
            }
            System.out.println();
        }
          for(int i=2;i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(n-j);
            }
            for(int j=1;j<2*i;j++){
                System.out.print(i);
            }
            for(int j=1;j<n-i;j++){
                System.out.print(i+j);
            }
            
            System.out.println();
        }
        sc.close();
    }
}
