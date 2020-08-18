public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int output = 0;
        int sum =0;
        for(int i=0;i<s.length();i++){
            int temp = ((int) s.charAt(i)) - 64;
            output = output * 26 + temp;
        }
        return output;
    }
}
