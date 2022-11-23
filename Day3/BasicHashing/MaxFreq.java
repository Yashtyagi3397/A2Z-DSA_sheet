package Day3.BasicHashing;

public class MaxFreq {
    static void freq(int arr[],int n){
        int fr[] = new int[n];
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
            fr[i] = count;
        }
        int max = 0;
        int min = fr[0];
        int in = 0;
        int in_m = 0;
        for(int i=0;i<n;i++){
            if(a[i]==true)continue;
          if(max<fr[i]){
              max = fr[i];
              in = i;    
           }
             if(min>fr[i]){
              min = fr[i];
              in_m = i;
             }
        }
        System.out.println(arr[in]+" is Present"+ " Maximum "+ max + " Times");
        System.out.println(arr[in_m]+" is Present"+ " Maximum "+ min + " Times");
    }
    public static void main(String[] args) {
        int arr[] ={2,4,5,7,8,2,5,5};
        int n = arr.length;
        freq(arr, n);
        
    
}

    
}
