package Day4.Sortingtype2nd;

public class Merge_sort {
    static void merge(int arr[],int low, int high){
        int mid = low+ (high-low)/2;
        int len1 = mid-low+1;
        int len2 = high = mid;
        int first[] = new int[len1];
        int sec[] = new int [len2];
        int mainArrayIndex = low;
        for(int i=0;i<len1;i++){
            first[i] = arr[mainArrayIndex++];
        }
        mainArrayIndex = mid+1;
        for(int i=0;i<len2;i++){
            sec[i] = arr[mainArrayIndex++];
        }
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = low;

        while(index1<len1&&index2<len2){
            if(first[index1]<sec[index2]){
                arr[mainArrayIndex++] = first[index1++];
            }
            else
                arr[mainArrayIndex++] = sec[index2++];
        }
        while(index1<len1){
            arr[mainArrayIndex++] = first[index1++];

        }
        while(index2<len2){
            arr[mainArrayIndex++] = sec[index2++];
        }


    }

    static void mergeSort(int arr[],int low,int high){
        if(low>=high)
        return;
        int mid = low + (high-low)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,high);
    }
    static void print(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {3,4,67,8,6,56,6,7,77};
        int n = arr.length;
        int low  = 0;
        int high = n-1;
        mergeSort(arr,low,high);
        print(arr,n);
        
    }
   
}
