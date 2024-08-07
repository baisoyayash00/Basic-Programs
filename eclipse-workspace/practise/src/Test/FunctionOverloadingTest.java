package Test;

public class FunctionOverloadingTest {
    int check(int num1, int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    
        int check(int num1 , int num2 , int num3)
        {
            int sum=num1+num2+num3;
            return sum;
        }
    
    public static void main(String[] args) {
        FunctionOverloadingTest obj =new FunctionOverloadingTest();
        int num1=28;
        int num2=29;
        int num3=39;
        System.out.println(obj.check(num1, num2));
        System.out.println(obj.check(num1, num2, num3));
    }

}
