package Day3.BasicHashing;

public class FindFreq {
    static void freq(int arr[],int n){
        boolean a[] = new boolean[n];
        for(int i=0;i<n;i++){
            if(a[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                   count = count+1;
                   a[j] = true;
                }
            }
            System.out.println(arr[i]+" is present "+count+ " times");
        }
    }
    public static void main(String[] args) {
        int arr[] ={2,4,5,7,8,2,5};
        int n = arr.length;
        freq(arr, n);
        
    }
}
