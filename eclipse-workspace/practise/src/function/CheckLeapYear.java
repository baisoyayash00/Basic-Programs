package function;

public class CheckLeapYear {
    String check(int num)
    {
        if(num%4==0)
        {
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        CheckLeapYear obj=new CheckLeapYear();
        int num=2021;
        System.out.println(obj.check(num));
    
    }

}
