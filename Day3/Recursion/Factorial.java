package Day3.Recursion;
import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n<2){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println("The Factorial is: "+fact(n)); 
         sc.close();
        
        
    }
}
