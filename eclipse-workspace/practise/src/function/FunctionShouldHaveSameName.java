package function;

public class FunctionShouldHaveSameName {
    int check(int num1, int num2)
    {
    int sum=num1+num2;
    return sum;
    }

    int check(int num)
    {
    int count=0;
    for(int i=1; i<=num; i++)
    {
if(num%i==0)
{
    count++;
}
    }
    if(count==2)
    {
        return 1;
    }
    return 0;
}
    
    public static void main(String[] args) {
        FunctionShouldHaveSameName obj=new FunctionShouldHaveSameName();
        int num1=25;
        int num2=29;
        System.out.println(obj.check(num1, num2));
        System.out.println(obj.check(num2));
    }

}

