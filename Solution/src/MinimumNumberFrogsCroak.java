public class MinimumNumberFrogsCroak {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c=0,r=0,o=0,a=0,k=0;
        int not_singing = 0;
        for(char croak: croakOfFrogs.toCharArray()){
            if(croak == 'c'){
                if(not_singing > 0){
                    not_singing--;
                }
                c++;
            } else if(croak == 'r'){
                if(c > 0){
                    c--;
                } else {
                    return -1;
                }
                r++;
            } else if(croak == 'o'){
                if(r > 0){
                    r--;
                } else {
                    return -1;
                }
                o++;
            } else if(croak == 'a'){
                if(o > 0){
                    o--;
                } else {
                    return -1;
                }
                a++;
            } else if(croak == 'k'){
                if(a > 0){
                    a--;
                } else {
                    return -1;
                }
                not_singing++;
            }
        }
        if(c > 0 || r > 0 || o > 0 || a > 0){
            return -1;
        }
        return not_singing;
    }
}
