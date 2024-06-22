package Test;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,6,23,46};
for(int i=0; i<arr.length; i++)
{
	if(arr[i]%23==0)
	{
		int count=0;
		for(int j=1; j<=arr[i]; j++)
		{
			if(arr[i]%j==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("primenumbers" + arr[i]);
		}	
	}
}

	}
}

