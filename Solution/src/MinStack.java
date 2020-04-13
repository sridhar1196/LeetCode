import java.util.Stack;
/*

Initially i approached problem with creating different variable to handle getMin and stack operation.
GetMin can be handled by using TreeMap which technicakky should give out min in order of constant time.

But a better way is saving the min value along with stack. So i created a new class to handle it

 */



public class MinStack {
    private int min = Integer.MAX_VALUE;
    private Stack<Value> stack;
    /** initialize your data structure here. */
    public MinStack() {
        this.stack = new Stack<Value>();
    }

    public void push(int x) {
        if(x < this.min){
            this.min = x;
        }
        Value value = new Value(this.min, x);
        this.stack.push(value);
    }

    public void pop() {
        Value value = this.stack.pop();
        if(this.stack.isEmpty()){
            this.min = Integer.MAX_VALUE;
        } else {
            this.min = getMin();
        }
    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        } else {
            Value value = this.stack.peek();
            return value.getValue();
        }
    }

    public int getMin() {
        if(stack.isEmpty()){
            return -1;
        } else {
            Value value = this.stack.peek();
            return value.getMin();
        }
    }
}

class Value{
    private int min;
    private int value;

    public Value(int min, int value){
        this.min = min;
        this.value = value;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

