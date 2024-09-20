package practiseyash;
class PrintOddEvenNumberInGivenArray{
    public static void main(String[] args) {
        int arr[]={33,2,4,71,88,92,9,10,1};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0  )
            {
                System.out.println("even"+arr[i]);
            }
        }
  for(int i=0; i<arr.length; i++)
            {
if(arr[i]%2!=0)
{
    System.out.println("odd"+arr[i]);
}
            }
        }
    }

