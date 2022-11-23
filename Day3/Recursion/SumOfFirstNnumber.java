package Day3.Recursion;

import java.util.Scanner;

public class SumOfFirstNnumber {
    static int sum(int n){
        
        if(n==0){
            return 0;
        }
         int sum = n + sum(n-1);
         return sum;

    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n)); 
        sc.close();
        
        
    }
}
