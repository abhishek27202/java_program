import java.util.HashSet;

public class Duplicate {


        public static void findDuplicates(int[] numbers) {
            HashSet<Integer> seenNumbers = new HashSet<>();
            System.out.println("Duplicate numbers are: ");

            for (int number : numbers) {
                if (!seenNumbers.add(number)) {
                    System.out.println(number); // Prints the duplicate number
                }
            }
        }

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5, 2, 6, 3, 7, 8, 9};
            findDuplicates(numbers);
        }
    }


