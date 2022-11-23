package Day3.Recursion;

import java.util.Scanner;

public class ReverseAnArray {
    static int[] reverse(int arr[],int n,int a,int b){
        
            if(a>=b){
                return arr;
            }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        a++;
        b--;
        reverse(arr, n-1, a, b);
        return arr;
        


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,8};
        int n = arr.length;
        int a = 0;
        int b = n-1;
        arr = reverse(arr,n, a, b);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");

        }
        sc.close();
         
        
    }
}
