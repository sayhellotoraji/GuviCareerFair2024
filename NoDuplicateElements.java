import java.util.*;

public class NoDuplicateElements {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input - array with space separated elements
        // 1 2 3 1
        String[] in = sc.nextLine().split(" ");

        int n = in.length;
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
        arr[i] = Integer.parseInt(in[i]);
        }

        System.out.println(containsDuplicate(arr));
    }
}
