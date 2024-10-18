package function;
class CheckPrimeNumberAndEven
{
    String CheckPrimeNumber(int num)
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
            return "yes";
          }
          return "not";
    }
    String CheckEvenNumber(int num)
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
        CheckPrimeNumberAndEven obj=new CheckPrimeNumberAndEven();
        int num=91;
        System.out.println(obj.CheckPrimeNumber(num));
        System.out.println(obj.CheckEvenNumber(num));

    }
}