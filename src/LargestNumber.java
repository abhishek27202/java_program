public class LargestNumber {
    public static void main(String[] args) {

                int[] numbers = {10, 50, 20, 60, 30};  // Array of numbers
                int largest = numbers[0];  // Assume the first number is the largest

                for (int i = 1; i < numbers.length; i++) {
                    if (numbers[i] > largest) {
                        largest = numbers[i];  // Update largest if current number is bigger
                    }
                }

                System.out.println("The largest number is: " + largest);
    }
}
