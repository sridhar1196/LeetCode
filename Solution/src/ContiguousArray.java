import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums.length <= 1){
            return -1;
        }
        int output = 0;
        int sum = 0;
        HashMap<Integer, Integer> index = new HashMap<>();
        index.put(0,0);
        for(int i=0;i<nums.length;i++){
            int add = nums[i];
            if(add == 0){
                add = -1;
            }
            sum = sum + add;
            if(index.containsKey(sum)){
                int prevIndex = index.get(sum);
                if(output < (i-prevIndex + 1)){
                    output = i-prevIndex + 1;
                }
            } else {
                index.put(sum, i+1);
            }
        }

        return output;
    }
}
