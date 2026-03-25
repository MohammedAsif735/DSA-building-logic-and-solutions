import java.util.Scanner;
public class sumOfNaturalNum {
    public static int printSum(int n){
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum += i;
        }
        return sum;
    }
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("enter a number : ");
       int num = sc.nextInt();
       System.out.println("Sum of Natural number 1 to " + num + " : " + printSum(num));
       sc.close();
    }
}
