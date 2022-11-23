package Day2;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        System.out.print("Size:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Elements in ArraY:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter Elements in Array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int max1=-233333;
        int max2=-288888;
        for(int i=0;i<n;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max2&& arr[i]!=max1){
                max2=arr[i];
            }
        }
        System.out.println("Secoond Max:"+max2);
        sc.close();
    }
}
