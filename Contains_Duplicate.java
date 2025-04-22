import java.util.HashSet;

public class Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hs.isEmpty() && hs.contains(nums[i])){
                return true;
            }
            hs.add(nums[i]);
        }
        return false;
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for (int i=0;i<nums.length;i++){
        //     if (nums[i]<min || nums[i]>max){
        //         min=Math.min(min,nums[i]);
        //         max=Math.max(max,nums[i]);
        //         continue;
        //     }
        //     for (int j=0;j<i;j++){
        //         if (nums[i]==nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
