public class Given_Pair {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        int i;
        int n=arr.length;
        for(i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]) break;
        }
        int l=(i + 1) % n;
        int r=i;
        while(l!=r){
            if(arr[l]+arr[r]>target){
                r=(r-1+n)%n;
            }else if(arr[l]+arr[r]<target){
                l=(l+1+n)%n;
            }else{
                return true;
            }
        }
        
        return false;
    }
}
