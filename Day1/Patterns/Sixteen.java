package Patterns;

import java.util.Scanner;
public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char a= 64;
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(a);
            }
            a++;
            System.out.println();
        }
        sc.close();
    }
}
