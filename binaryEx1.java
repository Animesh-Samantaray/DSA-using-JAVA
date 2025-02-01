public class binaryEx1 {
public static int find(int [] arr , int target )
{
    int st=0;
    int end=arr.length-1;int mid =0;
    while(st<=end)
    {
        mid = (st+end)/2;

        if(arr[mid]==target)
        return mid ;

    
     if(arr[mid]<arr[end])

     {
            if(target > arr[mid] && target <=arr[end])
            st = mid+1;
            else
            end = mid-1;
     }

     else{
        if(target >= arr[st] && target < arr[mid])
        {
                end = mid - 1;
        }
        else
        st = mid+1;
     }
    }
    return -1;
}

    public static void main(String[] args) {
        int [] arr = { 7,8,9,1,2,3,4,5};
        int pos = find(arr,45);
        System.out.println(pos);
    }
}
