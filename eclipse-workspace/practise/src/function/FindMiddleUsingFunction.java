package function;

public class FindMiddleUsingFunction {
    char check(String str)
    
    {
       int length=str.length();
       return  str.charAt(length/2);

        }
    
    public static void main(String[] args) {
       FindMiddleUsingFunction obj=new FindMiddleUsingFunction();
       String str="raj";
       System.out.println(obj.check(str));
    }

}
