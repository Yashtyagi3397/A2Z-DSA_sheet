package Day3.BasicHashing;

import java.util.Scanner;

public class FindFrequency {
    static void freq(int arr[],int n){
        boolean[] visited = new boolean[n];
        for(int i =0;i<n;i++){
            visited[i]=false;
        }
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count = 1;
            for(int j=i+1;i<n;i++){
                if(arr[i] == arr[j]){
                    visited[j]=true;
                    count++;
                }  
            }
            System.out.println(arr[i]+" is present "+count+" times ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        freq(arr, n-1);
        sc.close();
        
    }
}
