import java.util.Scanner;

public class SumOfNumbers {

   public static void main(String args[]){
      int sum = 0;

      System.out.print("Number: ");

      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      for (int i = 0; i<num; i++){
         sum = sum +i;
      }

      System.out.println("Sum of numbers is: " + sum + "\n");

   }
}
