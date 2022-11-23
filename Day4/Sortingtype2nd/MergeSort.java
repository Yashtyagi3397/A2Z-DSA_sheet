package Day4.Sortingtype2nd;

public class MergeSort {
    static void merge(int arr[],int low,int high){
        int mid = (low + high)/2;
        int len_1= mid-low+1;
        int len = high-mid;
        int first[] = new int[len_1];
        int sec[] = new int[len];
        int mainArrayIndex = low;
        for(int i=0;i<len_1;i++){
            first[i] = arr[mainArrayIndex++];
        }
        mainArrayIndex = mid+1;
        for(int i=0;i<len;i++){
            sec[i] = arr[mainArrayIndex++];
        }
        int index1 = 0;
        int index2=0;
        mainArrayIndex = low;
        while(index1<len_1 && index2<len){
            if(first[index1]<sec[index2]){
                arr[mainArrayIndex++] = first[index1++];
            }
            else{
                arr[mainArrayIndex++] = sec[index2++];
            }
        }

        while(index1<len_1){
            arr[mainArrayIndex++] = first[index1++];
        }
        while(index2<len){
            arr[mainArrayIndex++] = sec[index2++];
        }



          
    }
    static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void mergeSort(int arr[],int low,int high){
        if(low>=high) 
        return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,high);
        

    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,7,6,13,53,0};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        mergeSort(arr,low,high);
        print(arr, n);
        
    }
    
}
