package algorithms;

import java.math.BigInteger;

public class AddBinary {

    public static void main(String[] args){

        String a = "1001";
        String b = "11";

        BigInteger a1 = new BigInteger(a,2);
        BigInteger b1 = new BigInteger(b,2);
        System.out.println(a1.add(b1).toString(2));
    }
}
