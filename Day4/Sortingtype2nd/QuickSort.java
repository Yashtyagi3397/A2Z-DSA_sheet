package Day4.Sortingtype2nd;

public class QuickSort {
    static void quickSort(int arr[],int low,int high){

        if(low>high){
            return;
        }
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot-1);
            quickSort(arr, pivot+1, high);
        
        
    }

    static int partition(int arr[],int low,int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i<j) {
            while(arr[i]<=pivot && i<=high-1 ){
                i++;
            }
            while(arr[j]>pivot && j>=low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
            int temp = arr[j];
            arr[j] = arr[low];
            arr[low] = temp;
        
        return j;

    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {24,18,38,43,14,40,1,54};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        quickSort(arr, low, high);
        printArr(arr, n);
        
    }
}
