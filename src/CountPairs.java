import java.util.Scanner;

public class CountPairs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        System.out.println("Enter the number of elements: ");
        int arr[]=new int[n];
      for(int i=0; i<n; i++){
          arr[i]=sc.nextInt();
      }
      int count=0;
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              count++;
              System.out.println(arr[i]+","+arr[j]);
          }
      }
        System.out.println("Total number of pair is : "+count);

    }
}
