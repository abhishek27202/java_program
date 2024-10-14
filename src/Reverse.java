public class Reverse {


        public static void main(String[] args) {
            String originalString = "Hello, Raj!";
            String reversedString = new StringBuilder(originalString).reverse().toString();
            System.out.println(reversedString);
        }
    }

