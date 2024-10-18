package test;
class PrimeNumberOddEvenTest
{
    boolean checkPrimeNumber(int num)
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
return true;
}
return false;
    }
String checkOddEven(int num)  
{
    for(int i=0; i<num; i++)
    {
        if(num%2==0)
        {
            return "even";
        }
    }
    return "odd";
}


    public static void main(String[] args) {
    PrimeNumberOddEvenTest obj=new PrimeNumberOddEvenTest();
    
    int num=29;
        System.out.println( obj.checkPrimeNumber(num));
        System.out.println(obj.checkOddEven(num));
    }
}