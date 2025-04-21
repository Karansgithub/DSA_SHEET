class Maximum_and_Minimum_Element_in_an_Array {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        return new Pair(min, max);
    }
}
