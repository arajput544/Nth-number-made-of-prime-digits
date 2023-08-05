import java.math.BigInteger;

public class PrimePattern_CaptainCool {
    public static BigInteger primeDigits(int n)
    {
        //Your code here
        StringBuilder sb = new StringBuilder();

        while(n>0){
            int a = n%4;
            switch (a) {
                case 1:
                    sb.append(2);
                    n=n/4;
                    break;
                case 2:
                    sb.append(3);
                    n=n/4;
                    break;
                case 3:
                    sb.append(5);
                    n=n/4;
                    break;
                case 0:
                    sb.append(7);
                    n=n/4;
                    n=n-1;
                    break;
            }

        }
        sb.reverse();
        String res = sb.toString();
        BigInteger bigIntegerNumber = new BigInteger(res);
        return bigIntegerNumber;
    }
    public static void main(String[] args) {
        System.out.println(primeDigits(100000));
    }
}
