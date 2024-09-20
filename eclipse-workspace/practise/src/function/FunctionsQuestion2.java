package function;

public class FunctionsQuestion2 {
    int check(int num1, int num2)
    {
        int sum=num1+num2;
        return sum;
    }
    
        String check(int num)
        {
            if(num%5==0)
        {
             return "yes" ;
        }
            return "no";
           }
        
    
    public static void main(String[] args) {
        FunctionsQuestion2 obj=new FunctionsQuestion2();
        int num1=25;
        int num2=29;
System.out.println(obj.check(num1, num2));
    System.out.println(obj.check(num1))  ;  
    }

}
