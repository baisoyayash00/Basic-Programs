package Test;

public class CheckUsingFunctionStringStartWithAAndITContainsB {
    boolean checkStartWithA(String str)
    {
        if(str.charAt(0)=='a')
        {
            return true;
        }
        return false;
    }
    boolean CheckStartWithB(String str)
    {
        for(int i=0; i<str.length(); i++)
        {
        if(str.charAt(i)=='b')
        {
            return true;
        }
    }
        return false;
    }

    public static void main(String[] args) {
        CheckUsingFunctionStringStartWithAAndITContainsB obj=new CheckUsingFunctionStringStartWithAAndITContainsB();
        String str="jimmyyb" ;
        System.out.println(obj.checkStartWithA(str));
        System.out.println(obj.CheckStartWithB(str));
    }

}
