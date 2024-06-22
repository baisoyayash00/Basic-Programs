package Test;

public class CheckPrimeN0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=67;
		int  count=0;
for(int i=1; i<=num; i++)
{
	if (num%i==0)
	{
		count++;
		
	}
}
if(count==2)
{

	System.out.println( "primenumber");

}

	}

}


