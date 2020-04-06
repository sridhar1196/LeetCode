import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int x:nums){
            if(check.containsKey(x)){
                check.put(x,1);
            } else {
                check.put(x,0);
            }
        }
        int key = check.keySet().iterator().next();
        return check.get(key);
    }

    public static void main(String[] args){
        System.out.println(singleNumber(new int[]{2,2,1}));
    }
}
