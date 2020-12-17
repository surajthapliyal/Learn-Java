package BitManipulation;

public class bitman {

    static int getBitAt(int n,int pos){
        return (n&(1<<pos))==0?0:1;
    }
    static int setBit(int n,int pos){
        return n | (1<<pos);
    }
    static int clearBit(int n,int pos){
        return (n & (~(1<<pos)));
    }
    static int updateBit(int n,int pos,int value){
        // step1-clearBit:
        n = n&(~(1<<pos));
        // step2- return setBit with value:
        return n|(value<<pos);
    }
    public static void main(String[] args) {
        System.out.println(getBitAt(12, 1));
        System.out.println(setBit(5, 1));
        System.out.println(clearBit(5, 2));
        System.out.println(updateBit(5, 1, 1));
    }
}
