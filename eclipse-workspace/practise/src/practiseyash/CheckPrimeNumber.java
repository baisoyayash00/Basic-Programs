package practiseyash;

public class CheckPrimeNumber {
    String check(int num)
    {
    int count=0;
    for(int i=1; i<num; i++)
    {
if(num%i==0)
{
    count++;
}
    }
    if(count==2)
    {
        return "primenumber";
    }

    return "notprimenumber";
}  

    
    public static void main(String[] args) {
        CheckPrimeNumber obj=new CheckPrimeNumber();
        int num=2;
        System.out.println(obj.check(num));
    }

}
