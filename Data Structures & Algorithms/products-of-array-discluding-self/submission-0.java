class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        int[] prefix = new int[n];
        int[] ans = new int[n];

        int i = 0;
        int j = n-1;

        if (n == 1) {
            return new int[]{1};
        }

        while(i<=(n-1) && j>=0){
            if( i==0 || j==(n-1)){
                prefix[i]=nums[0];
                suffix[j]=nums[n-1];
                i++;
                j--;
            }
            else{
                prefix[i]=nums[i]*prefix[i-1];
                suffix[j]=nums[j]*suffix[j+1];
                i++;
                j--;
            }
        }

        for(int k=0;k<n;k++){
            if( k==0){
                ans[k] = suffix[k+1];
            }
            else if(k==(n-1)){
                ans[k]= prefix[k-1];
            }
            else{
                ans[k]= (suffix[k+1])*(prefix[k-1]);

            }
        }

        return ans;
    }
}  
