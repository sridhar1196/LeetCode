public class PerformStringShifts {
    public String stringShift(String s, int[][] shift) {
        int shiftNum = 0;
        System.out.println(shift.length);
        for(int i=0;i<shift.length;i++){
            if(shift[i][0] == 0){
                shiftNum = shiftNum - shift[i][1];
            } else {
                shiftNum = shiftNum + shift[i][1];
            }
        }
        shiftNum = shiftNum % shift.length;
        System.out.println(shiftNum);
        StringBuilder stringBuilder = new StringBuilder(s);
        if(shiftNum < 0){
            shiftNum = shiftNum * -1;
            for(int i=shiftNum;i>0;i--){
                char c = stringBuilder.charAt(0);
                stringBuilder.deleteCharAt(0);
                stringBuilder.insert(stringBuilder.length(),c);
            }
        } else if(shiftNum > 0){
            for(int i=shiftNum;i>0;i--){
                char c = stringBuilder.charAt(stringBuilder.length()-1);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
                stringBuilder.insert(0,c);
            }
        }
        return stringBuilder.toString();
    }
}
