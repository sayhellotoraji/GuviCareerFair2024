import java.util.*;
public class HappyNumber {
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = sumOfSquaresOfDigits(slow);
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));
            
            if (slow == 1) {
                return true;
            }
        } while (slow != fast);
        
        return false;
    }
    
    private static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isHappy(n));
    }
}
