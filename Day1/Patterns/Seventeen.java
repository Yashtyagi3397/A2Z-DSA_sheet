package Patterns;

import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        char a =65;
        char s = 64;
        char d;
        

        for(int i=1;i<=n;i++){
            d = s;
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(a);
                a++;
            }
            for(int j=0;j<i-1;j++){ 
               
                System.out.print(d);
                d--;
                
            }
            a =65;
            s++;
            
            
            System.out.println();
            
        

        }
        sc.close();
    }
}
