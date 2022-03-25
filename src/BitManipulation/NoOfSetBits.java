package BitManipulation;

public class NoOfSetBits {
    public static int numSetBits(int A) {

        int noOfSetBits = 0;
        
        while (A !=0){

            if((A&1) == 1){
                noOfSetBits++;
            }
            A = A>>1;
        }
        return noOfSetBits;
    }

    public static void main(String[] args) {

        System.out.println("No of Set bits in 98765 = "+numSetBits(98765));
    }
}
