import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Terceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = countPairsWithDifferenceK(arr, k);
        System.out.println(count);
    }

    public static int countPairsWithDifferenceK(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();

        int count = 0;
        for (int num : arr) {
            int target1 = num + k;
            int target2 = num - k;

            if (set.contains(target1)) {
                count++;
            }
            if (set.contains(target2)) {
                count++;
            }

            set.add(num);
        }

        return count;
    }
}
