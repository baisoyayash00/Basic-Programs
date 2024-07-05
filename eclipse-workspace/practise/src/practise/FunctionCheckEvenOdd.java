package practise;

public class FunctionCheckEvenOdd {
   
   public static  String checkOddEven(int n){
        String odd="this odd number";
        String even="this is even number";
       if(n%2==0)
       return even;
       return odd; 
    }
    public static void main(String[] args) {
       int num=25;
       System.out.println(checkOddEven (num));
       int num1=22;
       System.out.println(checkOddEven (num1));
    }

}
