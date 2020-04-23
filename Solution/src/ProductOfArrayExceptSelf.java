public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        output[0] = 1;
        int value = nums[0];
        for(int i=1;i<nums.length;i++){
            output[i] = value;
            value = value * nums[i];
        }
        value = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            output[i] = value * output[i];
            value = value * nums[i];
        }
        return output;
    }
}
