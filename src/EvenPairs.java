import java.util.Scanner;

public class EvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean found=false;
        for(int i = 0; i < arr.length; i++) {
            for(int j=i+1;j<arr.length; j++) {
                if(arr[i] % 2 == 0 && arr[j] % 2 == 0 ) {
                    System.out.println("Even Pair : (" + arr[i] + ", " + arr[j] + ")");
                    found=true;
                }
            }
        }if(!found){
            System.out.println("No even pairs found ");
        }
    }
}
