package Day2;

import java.util.Scanner;

public class GcdOrlcm {
    public static void hcforlcm(int a,int b){
        int copy_a = a,copy_b=b;
        while(a%b!=0){
             int res = a%
             b;
             a = b;
             b = res;
        }
        System.out.println("The Hcf Of Given Numbers is: "+b);
        int lcm = (copy_a*copy_b)/b;
        System.out.println("The Lcm is :"+lcm );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        int b = sc.nextInt();
        hcforlcm(a, b);
        sc.close();
    }
}
