package Test;

public class TestPrimeNumber18062024{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=75;
int count=0;
for(int i=0; i<num; i++)
{
	if(num%i==0)
	{
		count++;
		
	}
}
if(count==2)
{
   System.out.println("primenumbers");	
}
	}

}
