# Nth-number-made-of-prime-digits
Given a number 'N'. The task is to find the Nth number whose each digit is a prime number i.e 2, 3, 5, 7. In other words you have to find nth number of this sequence : 2, 3, 5, 7, 22, 23 ,.. and so on.

Example 1:
Input:
N = 10
Output: 33
Explanation:10th number in the sequence of
numbers whose each digit is prime is 33.
Example 2:
Input:
N = 21
Output: 222
Explanation:21st number in the sequence of
numbers whose each digit is prime is 222.
Your Task:
Complete primeDigits function and return the nth number of the given sequence made of prime digits.
Constraints:
1 <= N <= 100 







Divide until you get <= 4 value and keep on adding digits from the back. If modulo is 1 than add 2, if it is 2 than add 3, if it is 3 than add 5, if it is 5 than add 7.

If modulo is 0, than after dividing , substract 1 from it and then do the same process.

Example : 4 -> 4%4 is 0 so add 7 in the back and 4/4 is 1, now 1-1 is 0 so no need to do anything.
Example : 20 -> 20%4 is 0 so add 7 in the back and 20/4 is 5, now 5-1 is 4 so again same process 
4%4 is 0 so add 7 and 4/4 is 1, now 1-1 is 0 so no need to do anything.
So the answer is 77.
Example : 48 -> 48%4 is 0 so 7 in the back and 48/4 is 12 now, 12-1 = 11, 11%4 is 3 so add 5 from front, so for now our answer is 57, now 11/4 is 2 and for 2%4 = 2 and for 2 we will have to add 3 from the front.
So our string is 357.

Example 77: 77%4 = 1 so add 2 from front, and 77/4 = 19,	 String is 2
	         19%4 = 3 so add 5 form front, and 19/4 = 4, 	 String is 52
	         4%4 = 0 so add 7 from front, and 4/4 =1 and 1-1=0	 String is 752

And the answer is correct.




import java.math.BigInteger;

public class PrimePatternGFG {
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
        System.out.println(primeDigits(10));
    }
}





