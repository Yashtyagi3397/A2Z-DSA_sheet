package Day3;

import java.util.Scanner;

public class LargestElement {
    static int largestEle(int arr[],int n){
        int max = 0;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Size ogf Array: ");
        // int n = sc.nextInt();
        int arr[] = {2,3,4,5,7};
        int n = arr.length;
        System.out.println("Largest number is: "+largestEle(arr, n)); 
        sc.close();
        
    }
}
