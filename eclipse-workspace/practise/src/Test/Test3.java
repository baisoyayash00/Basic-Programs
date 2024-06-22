package Test;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {7,9,12,24,31,66}; //defined array
for (int i=0; i<arr.length; i++) //iterate the array
{
int rem=arr[i]%7;
if(rem%3==0)
	{ 
		System.out.println(arr[i]);
	}
}
	}

}

//when element of an array is divided by 7 and its reminder divisble by 3 then print element
