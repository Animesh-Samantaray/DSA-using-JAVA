
public class all_concept {
    public static int[] plusOne(int[] arr) {
        long sum1=0;//for storing the sum of the elements present in the array 

        for(int i=0;i<arr.length;i++)
        {
            sum1=(sum1*10)+arr[i];
            System.out.println("sum = "+sum1);
        
        }
   sum1++;
    int ld = 0;
    long ref=sum1;// ld -- for storing the number of digits present in sum1

        while(ref>0){
            ld++;
            ref=ref/10;
        }
            int [] brr = new int[ld];
    for(int i=brr.length-1;i>=0;i--)
    {
       // System.out.println(sum1);
                brr[i]=(int)sum1%10;
        sum1/=10;
    }
    System.out.println(brr[brr.length-1]);
System.out.println();
        return brr;

    }

    public static void main(String ar[])
    {
        int arr[] = { 9,8,7,6,5,4,3,2,1,0};
        int[]  brr= plusOne(arr);
        for(int i : brr)
        System.out.print(i+" " );
    }
}
