import java.util.Scanner;
public class SumOfSquare {
    public static int summation(int n){
        int sum = 0;
        int square = 1;
        for(int i = 1; i<=n;i++){
            square = i*i;
            sum += square;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int res  = summation(num);
        System.out.println("Sum of Squares of First n Natural numbers: " + res);
        sc.close();
        
    }
}
