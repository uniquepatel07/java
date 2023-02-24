public class bitManipulation {

    public static void oddEven(int n){
        int bitMask = 1;
        if((n&bitMask) == 0){
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }
    }

    // get ith bit
    public static int getBit(int n, int i){
        int bitMask = 1<<i;
        if((n&bitMask)==0){
            return 0;
        }
        else {
            return 1;
        }
    }

    // set the ith bit

    public static int setBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    // clear bit
    public static  int clearBit(int n, int i){
        int bitMask = ~(1<<i);
        return n  & bitMask;
    }
    public static void main(String[] args) {
        oddEven(6);
        System.out.println(getBit(5, 2));
        System.out.println(setBit(10, 2));
        System.out.println(clearBit(10, 1));
    }
}
