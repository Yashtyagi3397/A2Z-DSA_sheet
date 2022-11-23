package Day4.Sortingtype1st;

public class Insertion_Sort {
    public static void insertionSort(int arr[],int n){

        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1] = arr[j];
                }
                else
                break;
            }
            arr[j+1]=temp;
        }
        printArr(arr, n);

          
    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,45,2,35,6,7,8,0};
        int n = arr.length;
        insertionSort(arr, n);
        
    }
}
