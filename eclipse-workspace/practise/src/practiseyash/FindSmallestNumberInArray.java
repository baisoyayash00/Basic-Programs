package practiseyash;
class FindSmallestNumberInArray{
    public static void main(String[] args) {
        int arr[]={55,8,7,97,85,55};
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}