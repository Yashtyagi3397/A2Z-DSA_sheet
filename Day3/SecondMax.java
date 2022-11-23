package Day3;

import java.util.Scanner;

public class SecondMax {

    static int largestEle(int arr[],int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static int secondMAx(int arr[],int n ){
        int max = largestEle(arr, n);
        int secMax=0;
        for(int i=0;i<n;i++){
            if(secMax<arr[i]&&arr[i]<max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,4,5,7};
        int n = arr.length;
        System.out.println("Second Largest number is: "+ secondMAx(arr, n)); 
        sc.close();
        
    }
}
