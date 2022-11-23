package Day2;

import java.util.Scanner;

public class CountDigit {
    public static void count(int n){
        int count = 0;
        while(n!=0){
            n = n/10;
            count++;

        }
        System.out.println("The Number of Digits in Given No. is "+count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
        sc.close();

        
    }
}
