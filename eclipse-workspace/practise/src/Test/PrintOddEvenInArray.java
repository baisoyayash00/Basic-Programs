package test;
class PrintoddEvenInArray{
    public static void main(String[] args) {
        int arr[]={1,5,9,10,15,65};
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%2!=0) 
            {
                System.out.println("odd" + arr[i]);
                
            }
            else
            System.out.println("even"+ arr[i]);
        }
    }
}