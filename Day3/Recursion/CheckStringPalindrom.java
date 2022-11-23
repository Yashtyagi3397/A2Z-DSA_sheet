package Day3.Recursion;

import java.util.Scanner;

public class CheckStringPalindrom {
    static String reverse(String str,int n){
        if(n==0){
            String s = ""+str.charAt(n);
            return s;
        }
    
        return str.charAt(n)+reverse(str, n-1);
    }
    static boolean isPalindrom(String str,int n){
        str = str.toLowerCase();
        String c = reverse(str, n-1);
        System.out.println(reverse(str,n-1));
        c = c.toLowerCase();
        if(str.equals(c)) return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine(); 
        int n = str.length();
        if(isPalindrom(str, n))System.out.println("The Given String is Palindrom");
        else System.out.println("The Given String is Not Palindrom");
        sc.close();
        
    }
}
