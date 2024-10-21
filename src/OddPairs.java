import java.util.Scanner;

public class OddPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]%2!=0 && arr[j]%2!=0){
                    System.out.println("Odd Pair : (" + arr[i] + ", " + arr[j] + ")");
                    found=true;
                }
            }
        }if(!found){
            System.out.println("No odd pairs found ");
        }
    }
}
