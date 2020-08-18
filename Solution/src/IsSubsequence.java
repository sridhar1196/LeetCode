public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int index = 0;
        for(char c: t.toCharArray()){
            if(s.charAt(index) == c){
                index++;
            }
        }
        if(index != s.length()-1){
            return false;
        }
        return true;
    }
}
