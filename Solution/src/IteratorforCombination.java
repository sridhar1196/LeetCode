public class IteratorforCombination {
    int[] combination;
    int length;
    boolean next;
    int index;
    String inputCharacter;
    public IteratorforCombination(String characters, int combinationLength) {
        combination = new int[combinationLength];
        // length = combination.length();

        if(combinationLength > characters.length()){
            next = false;
        } else {
            next = true;
            for(int i=0;i<combination.length;i++){
                combination[i] = i;
            }
        }
        index = combination.length - 1;
        inputCharacter = new String(characters);
    }

    public String next() {
        if(next){
            StringBuilder output = new StringBuilder();
            for(int i: combination){
                output.append(inputCharacter.charAt(i));
            }
            index = combination.length - 1;
            int change = combination[index] + 1;
            combination[index] = combination[index] + 1;
            while(change > (inputCharacter.length() - 1) && next){
                index--;
                if(index >= 0){
                    change = combination[index] + 1 + (combination.length - 1) - index;
                    combination[index] = combination[index] + 1;
                } else {
                    next = false;
                }
            }
            index++;
            while(next && index < combination.length){
                combination[index] = combination[index - 1] + 1;
                index++;
            }
            return output.toString();
        } else {
            return null;
        }
    }

    public boolean hasNext() {
//        index = combination.length - 1;
//        if(next){
//            int change = combination[index] + 1;
//            combination[index] = combination[index] + 1;
//            while(change > (inputCharacter.length() - 1) && next){
//                index--;
//                if(index >= 0){
//                    change = combination[index] + 1 + (combination.length - 1) - index;
//                    combination[index] = combination[index] + 1;
//                } else {
//                    next = false;
//                }
//            }
//            index++;
//            while(next && index < combination.length){
//                combination[index] = combination[index - 1] + 1;
//                index++;
//            }
//
//            return next;
//        } else {
//            return false;
//        }
        return next;
    }
}
