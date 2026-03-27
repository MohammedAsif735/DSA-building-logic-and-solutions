public class SwapToNumbers{
    public static void main(String args[]){
        int a = 2;
        int b  = 3;
         System.out.println("Before swap a : "  + a + "  b: "  + b );
        //Swap a and b using temp variable
        int temp = a;
        a = b;
        b = temp;
         System.out.println("After swap a : " +a+ "  b: "+ b );
        
    }
}