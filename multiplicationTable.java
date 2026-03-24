import java.util.Scanner;
public class multiplicationTable {
    public static void productOf(int n){
        int result = 0;
        for(int i=1;i<=10;i++){
            result = n*i;
            System.out.println(n + "*" + i + "=" + result);
        }
    }
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number for multiplication Table: ");
         int num = sc.nextInt();
         productOf(num);
         sc.close();
    }
}
