package Day4.Sortingtype1st;
public class SelectionSort {
    public static void Print(int arr[],int n) {
    
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        // for(int i = 0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        }
    
    public static void main(String[] args){
        int arr[] = {2,4,52,4,3,0};
        int n = arr.length;
        selectionSort(arr, n);
        Print(arr,n);
    }
}
