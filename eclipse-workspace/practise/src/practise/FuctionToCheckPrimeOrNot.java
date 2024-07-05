package practise;

public class FuctionToCheckPrimeOrNot {
    public static String checkPrimeOrNot(int n){
        String primeNumber="this is prime number";
        String primeNumberNot="this is not prime number";
        int count=0;
      for (int i=1; i<=n; i++ )  
{
    if(n%i==0)
    {
       count++; 
    }
if(count==2)
        {
            return primeNumber;
            
        }
    }
    return primeNumberNot;
}
    
    public static void main(String[] args) {
        int num=25;
    }

}
