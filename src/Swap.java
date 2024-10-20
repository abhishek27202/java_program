public class Swap {
    public static void main(String[] args) {
        int a=4;
        int b=5;
        System.out.println("Before swapping: a = "+a+", b = "+b);
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println("after swapping: a = "+a+", b = "+b);
    }
}
