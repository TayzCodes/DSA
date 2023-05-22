package BitManipulation;

public class ChangeAds {

    public static void changeAds(int base10) {
        int countOnebits = 0;
        int bitFoundAt = 0;
        for(int bit = 31;bit>=0;bit--){
            int val = 1 << bit;
            if( (int)(base10 & val)  == 1) {
                bitFoundAt = bit;
            }
        }
    }

}
