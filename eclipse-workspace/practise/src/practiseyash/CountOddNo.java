package practise;

public class CountOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,6,11,19,21,9,35,10,7};
int count=0;
for(int i=1; i<10; i++)
{
	if(arr[i]%2!=0)
	{
		count++;
	}
}
System.out.println(count);
	}

}
