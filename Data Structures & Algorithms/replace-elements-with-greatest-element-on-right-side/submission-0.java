class Solution {

    public Integer findMax(int arr[], int index){
        Integer max = Integer.MIN_VALUE;
        for(int i = index; i<arr.length; i++){
            if( arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        for( int i = 0; i< arr.length; i++){
            arr[i] = findMax(arr, i+1);
            if(i == arr.length -1){
                arr[i] = -1;
            }
        }
        return arr;
    }

    
}