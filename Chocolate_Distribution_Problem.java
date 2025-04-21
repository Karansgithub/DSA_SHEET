import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution_Problem {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n=arr.size();
        if(n<m){
            return -1;
        }
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=arr.size()-m;i++){
            min=Math.min(min,arr.get(i+m-1)-arr.get(i));
        }
        return min;
    }
}
