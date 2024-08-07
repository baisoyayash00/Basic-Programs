package function;

public class CheckOddEven {
    String check (int num)
    {
        if(num%2==0 )
        return "Even";
    return "Odd";
    }
    

    
    public static void main(String[] args) {
        CheckOddEven obj =new CheckOddEven();
        int n=8;
        System.out.println(obj.check(n));
    }

}
