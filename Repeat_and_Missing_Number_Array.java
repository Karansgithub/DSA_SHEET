public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int repeated=-1;
        int missing =-1;
        for(int i=0;i<A.length;i++){
            int val=Math.abs(A[i]);
            if(A[val-1]>0){
                A[val-1]=-A[val-1];
            }else{
                repeated=val;
            }
        }
        for(int i=0;i<A.length;i++){
            if(A[i]>0){
                missing=i+1;
            }
        }
        return new int[]{repeated, missing};
    }
}
