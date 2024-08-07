package practiseyash;

public class CheckEvenOdd {
    String check(int num)
    {
        if(num%2==0)
        return "even";
        return "odd";
    }
    public static void main(String[] args) {
        CheckEvenOdd obj=new CheckEvenOdd();
       int num=25;
        System.out.println(obj.check(num));
        int num2=28;
        System.out.println(obj.check(num2));
        
    }

}
