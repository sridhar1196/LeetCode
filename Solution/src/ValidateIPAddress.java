public class ValidateIPAddress {
    public String validIPAddress(String IP) {
        if(IP.contains(".")){
            String[] nums = IP.split("\\.", -1);
            if(nums.length > 4){
                return "Neither";
            }
            for(String num: nums){
                int temp = 0;
                if(num.length() > 3 || num.length() == 0){
                    return "Neither";
                }
                for(char val: num.toCharArray()){
                    if((int) val >= 48 && (int) val <=57){
                        temp = ((int) val) - 48 + temp*10;
                    } else {
                        return "Neither";
                    }
                }

                if(temp >= 256 || String.valueOf(temp).length() != num.length()){
                    return "Neither";
                }
            }
            return "IPv4";
        } else if(IP.contains(":")){
            String[] hexas = IP.split(":", -1);
            if(hexas.length >= 9){
                return "Neither";
            }
            for(String hexa: hexas){
                if(hexa.length() > 4 || hexa.length() == 0){
                    return "Neither";
                }
                for(char val: hexa.toLowerCase().toCharArray()){
                    if(((int) val >= 97 && (int) val <=102) || ((int) val >= 48 && (int) val <=57)){
                        continue;
                    } else {
                        return "Neither";
                    }
                }
            }
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}
