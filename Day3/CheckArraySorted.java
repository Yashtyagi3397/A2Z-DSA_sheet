package Day3;

import java.util.Scanner;

public class CheckArraySorted {
    static boolean isSorted(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,4,5,7,9};
        int n = arr.length;
        if(isSorted(arr, n))System.out.println("The Given Array is sorted");
        else System.out.println("The Given Array Is Not Sorted");
        sc.close();
        
    }
}
