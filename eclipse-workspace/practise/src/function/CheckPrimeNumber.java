package function;

public class CheckPrimeNumber {
    String check(int num)
{
        int count =0;
        for(int i=1; i<=num;i++)
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

    CheckPrimeNumber obj = new CheckPrimeNumber();
        int num[]={1,3,4,5,7,6,9,8,13};
        for(int i=0;i<num.length;i++)
            System.out.println("Element is "+num[i]+" "+obj.check(num[i]));
        }
    
    }


