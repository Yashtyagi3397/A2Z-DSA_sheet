package Day4.Sortingtype1st;
public class InsertionSort {
    static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(arr[j]>temp && j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            
            arr[j+1] = temp;
        }
        printArr(arr, n);
    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    } 
    public static void main(String[] args) {
        int arr[]={3,4,5,4,2,5,7,0};
        int n = arr.length;
        insertionSort(arr, n);
       

        
    }
    
}
