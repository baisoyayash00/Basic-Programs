package array;
class MultidimensionalArray{
    public static void main(String[] args) {
        int arr[] []={{1,2,3}, {4,5,6}, {7,8,9}};
        int rowLength=arr.length;
        int columnLength=arr.length;
        for(int i=0; i<rowLength; i++)
        {
            for(int j=0; j<columnLength; j++)
            {
                System.out.print(arr[i][j]);
            }
        }
    }
}