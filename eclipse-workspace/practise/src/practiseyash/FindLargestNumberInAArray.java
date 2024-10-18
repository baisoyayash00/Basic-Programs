package practiseyash;
class FindLargestNumberInAArray{
    public static void main(String[] args) {
        int arr[]={20,30,80,55,3,100,1};
        int max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}