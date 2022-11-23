package Day4.Sortingtype1st;

public class Bubble_Sort {
    static void bubbleSort(int arr[],int n){
        boolean swapped = false;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)
            break;
        }
        printArr(arr, n);
    }
    static void printArr(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={4 ,1, 3 ,9 ,7};
        int n = arr.length;
        bubbleSort(arr, n);
        
    }
}
