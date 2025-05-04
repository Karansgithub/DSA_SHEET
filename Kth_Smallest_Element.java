public class Kth_Smallest_Element {
    public static int kthSmallest(int[] nums, int k) {
        // Your code here
        int min=nums[0];
        int max=nums[0];
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        int length=max-min+1;
        int arr[]=new int[length];
        for(int i:nums){
            arr[i-min]++;
        }
        for(int i=0;i<arr.length;i++){
            k=k-arr[i];
            if(k<=0) return i+min;
        }
        return -1;
    }
}
