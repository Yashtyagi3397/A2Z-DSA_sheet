package Day2;

import java.util.Scanner;

public class Armstrong {
    static int count(int n){
        int count=0;
        while(n!=0){
            n = n/10;
            count++;
        }
        return count;
    }
    static boolean isArms(int n){
        int co_n=n,sum=0;
        int count = count(n);
        while(n!=0){
            int a = n%10;
            sum = sum + (int)Math.pow(a, count);
            n = n/10;

        }
        if(sum == co_n)return true;
        else return false;
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isArms(n)) 
        System.out.println("The given Number is Armstrong Number");
        else{
            System.out.println("The Given Number is Not ArmStrong");
        }
        sc.close();
        
    }
}
