import java.util.*;

public class NonRepeatingFirstChar {
    public static int firstUniqChar(String s) {
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        
        for (char ch : s.toCharArray()) {
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                return s.indexOf(entry.getKey());
            }
        }
        
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(firstUniqChar(s));
    }
}
