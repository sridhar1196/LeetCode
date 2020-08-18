public class SubarrayProductLessThanK {
    public int numSubarrayProductLessThanK(int[] nums, int max) {
        int[] output = new int[nums.length];
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < max){
                count++;
            }
            output[i] = nums[i];
        }
        int i = 0;
        int j = output.length-1;
        while(i<j){
            int k = i;
            while(k<j){
                output[k] = nums[k]*output[k+1];
                if(output[k]<max){
                    count++;
                }
                k++;
            }
            j--;
        }
        return count;
    }
}
