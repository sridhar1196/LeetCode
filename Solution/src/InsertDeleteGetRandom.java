import java.util.ArrayList;
import java.util.HashMap;

public class InsertDeleteGetRandom {
    HashMap<Integer, Integer> output;
    ArrayList<Integer> value;
    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        this.output = new HashMap<>();
        this.value = new ArrayList<Integer>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(output.containsKey(val)){
            return false;
        } else {
            output.put(val, value.size());
            value.add(val);
            return true;
        }
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(output.containsKey(val)){
            int index = output.get(val);
            int temp = value.get(value.size() - 1);
            value.set(index, temp);
            value.remove(value.size() - 1);
            output.put(temp, index);
            output.remove(val);
            return true;
        } else {
            return false;
        }
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int min = 0;
        int max = value.size() - 1;
        int rand = (int) (Math.random() * (max - min + 1) + min);
        return value.get(rand);
    }
}
