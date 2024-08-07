package Test;

public class AddTwoNumberUsingFunction {
    int check(int num1, int num2)
    {
        int sum= num1+num2 ;
return sum;
    
    }
    public static void main(String[] args) {
      AddTwoNumberUsingFunction obj=new AddTwoNumberUsingFunction() ;
      int num=20;
      int num2=25;
      System.out.println(obj.check(num, num2));
    }

}
