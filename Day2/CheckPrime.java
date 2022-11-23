package Day2;

import java.util.Scanner;

public class CheckPrime {
    static boolean isPrime(int n){
        boolean prime = true;
        for(int i=2;i<n;i++){
            if(n%i==0){
                prime = false;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("The Number is Prime ");
        }
        else{
            System.out.println("The Number is Not Prime");
        }
        sc.close();
        
    }
}
