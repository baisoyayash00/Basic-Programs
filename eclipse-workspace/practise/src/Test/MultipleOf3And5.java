package Test;

public class MultipleOf3And5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {5,15,30,48,100,150,120,131};
for(int i=0; i<arr.length; i++)
{
	if(arr[i]%3==0 && arr[i]%5==0)
	{
		System.out.println(arr[i]);
	}
}
	}

}
