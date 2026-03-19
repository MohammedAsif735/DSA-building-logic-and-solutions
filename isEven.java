class isEven {
    public static void isEvenorOdd(int n) {
        // code here
        int rem = n % 2;
        if(rem == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        
    }
    public static void main(String args[]){
        int x = 16;
        isEvenorOdd(x);
    }
}