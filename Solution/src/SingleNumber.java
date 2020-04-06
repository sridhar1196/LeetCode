import java.util.HashMap;
import java.util.Set;

public class SingleNumber {
    public SingleNumber() {
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> check = new HashMap<>();
        for(int x:nums){
            if(check.containsKey(x)){
                check.remove(x);
            } else {
                check.put(x,x);
            }
        }
        int key = check.keySet().iterator().next();
        return check.get(key);
    }

//    public static void main(String[] args){
//        System.out.println(singleNumber(new int[]{2,2,1}));
//    }
}
