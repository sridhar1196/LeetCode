public class ReformatheString {
    public String reformat(String s) {
        StringBuilder output = new StringBuilder();
        StringBuilder character = new StringBuilder();
        StringBuilder digits = new StringBuilder();
        for(char c: s.toCharArray()){
            if(((int) c) >=48 && ((int) c) <=57){
                digits.append(c);
            } else if(((int) c) >=97 && ((int) c) <=122){
                character.append(c);
            }
        }
        if(digits.length() == character.length() || (digits.length()+1) == character.length() || digits.length() == (character.length()+1)){
            if(digits.length() > character.length()){
                int i = 1;
                while(digits.length() > 0){
                    if(i%2 == 0){
                        output.append(character.charAt(0));
                        character.deleteCharAt(0);
                    } else {
                        output.append(digits.charAt(0));
                        digits.deleteCharAt(0);
                    }
                    i++;
                }
            } else if(digits.length() < character.length()){
                int i = 1;
                while(character.length() > 0){
                    if(i%2 == 0){
                        output.append(digits.charAt(0));
                        digits.deleteCharAt(0);
                    } else {
                        output.append(character.charAt(0));
                        character.deleteCharAt(0);
                    }
                    i++;
                }
            } else {
                int i = 1;
                while(digits.length() > 0){
                    if(i%2 == 0){
                        output.append(digits.charAt(0));
                        digits.deleteCharAt(0);
                    } else {
                        output.append(character.charAt(0));
                        character.deleteCharAt(0);
                    }
                    i++;
                }
            }
            return output.toString();
        } else {
            return "";
        }
    }
}
