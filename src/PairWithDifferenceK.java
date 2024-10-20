import java.sql.SQLOutput;
import java.util.Scanner;

public class PairWithDifferenceK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] - arr[i]) == k) {
                    System.out.println("Pair found: " + arr[i] + " and " + arr[j]);

                }

            }
        }
    }
}
