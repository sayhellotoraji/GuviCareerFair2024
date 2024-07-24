import java.util.Scanner;

public class LicenseKeyFormat {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        
        // Step 1: Remove dashes and convert to uppercase
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                sb.append(Character.toUpperCase(ch));
            }
        }
        
        // Step 2: Calculate lengths
        int n = sb.length();
        int firstGroupLength = n % k;
        
        StringBuilder result = new StringBuilder();
        
        // Append first group
        if (firstGroupLength > 0) {
            result.append(sb.substring(0, firstGroupLength));
        }
        
        // Append remaining groups with dashes
        for (int i = firstGroupLength; i < n; i += k) {
            if (result.length() > 0) {
                result.append('-');
            }
            result.append(sb.substring(i, Math.min(i + k, n)));
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
       
        // Example 1
        // Input: s = "5F3Z-2e-9-w", k = 4
        Scanner sc = new Scanner(System.in);

        String s2 = sc.nextLine();
        int k2 = sc.nextInt();
        System.out.println(licenseKeyFormatting(s2, k2)); 
    }
}
