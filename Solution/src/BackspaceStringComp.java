import java.util.Stack;

public class BackspaceStringComp {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        int backSpace = 0;
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) == '#'){
                backSpace++;
            } else if(backSpace > 0){
                backSpace--;
            } else {
                s1.push(S.charAt(i));
            }
        }
        backSpace = 0;
        for(int i=T.length()-1;i>=0;i--){
            if(T.charAt(i) == '#'){
                backSpace++;
            } else if(backSpace > 0){
                backSpace--;
            } else {
                s2.push(T.charAt(i));
            }
        }
        while(!(s1.isEmpty() || s2.isEmpty())){
            if(s1.pop() != s2.pop()){
                return false;
            }
        }
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
