package Test;
class FindArray{
    public static void main(String[] args) {
        int arr[]={1,3,15};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%3==0 && arr[i]%5==0)
            {
                if(arr[i]%2==0)
                {
                System.out.println("even"+ arr[i]);
            
                }
                }

            }
        }
}
