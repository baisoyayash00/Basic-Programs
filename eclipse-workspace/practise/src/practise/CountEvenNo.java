package practise;

public class CountEvenNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,6,8,10,3,9,7,19,21};
int count=0;
for(int i=1; i<10; i++)
{
	if(arr[i]%2==0)
	{
		count++;
		
	}
}
System.out.println(count);
	}

}
