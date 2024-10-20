import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        int temp=0;
        int original=n;
        while(n!=0){
            int remainder=n%10;
            temp= temp*10+remainder;
            n=n/10;
        }
       if(temp==original){
           System.out.println("palindrome number");
       }else{
           System.out.println("Not a palindrome number");
       }
    }
}
