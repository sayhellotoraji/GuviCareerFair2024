import java.util.*;
/**
 * IsomorphicStrings
 */
public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Character> s_to_t = new HashMap<>();
        Map<Character, Character> t_to_s = new HashMap<>();
        
        for (int i = 0; i < s.length(); i++) {
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);
            
            if (s_to_t.containsKey(s_char)) {
                if (s_to_t.get(s_char) != t_char) {
                    return false; // inconsistency found
                }
            } else {
                s_to_t.put(s_char, t_char);
            }
            
            if (t_to_s.containsKey(t_char)) {
                if (t_to_s.get(t_char) != s_char) {
                    return false; // inconsistency found
                }
            } else {
                t_to_s.put(t_char, s_char);
            }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String 1:");
        String s = sc.nextLine();
        System.out.println("String 2:");
        String t = sc.nextLine();

        System.out.println(isIsomorphic(s, t));
    }
    
}