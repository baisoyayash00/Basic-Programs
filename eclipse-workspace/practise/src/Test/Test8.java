package Test;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {9,7,8,6,5,2,37,38,47,48,45,13,26,39};
for(int i=0; i<arr.length; i++)
{
	if(arr[i]%2!=0 && arr[i]%13==0)
	{
			
		System.out.println("odd " +  arr[i]);
	
}
if(arr[i]%2==0 && arr[i]%13==0)
{
	System.out.println("even " +  arr[i]);
}
	}

}

}
//odd13
//even26