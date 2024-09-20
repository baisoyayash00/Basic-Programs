package function;
class CheckPrimeNumberIn13Table {
    String check(int num)
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
        return "primenumber";
      }
      return "notprimenumber";
    }
     
    public static void main(String[] args) {
        CheckPrimeNumberIn13Table obj=new CheckPrimeNumberIn13Table();
        int num=71;
        System.out.println(obj.check(num ));
    }
}