package Patterns;

import java.util.Scanner;

public class Eighteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 65+n;
        char a = (char)d;
        char c;
        for(int i=0;i<=n;i++){
             c = a;
            for(int j=0;j<i;j++){
                System.out.print(c++);
            }
            a--;
            System.out.println();


        }
        sc.close();


    }
}
