public class nexTgreatest {
    static int[] NextGreatest(int [] arr )
    {
        int[] x = new int[arr.length];
       for(int i=0;i<arr.length;i++){
        x[i]=-1;
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]<arr[j] && j!=arr.length){
                x[i]=arr[j];
                break;
            }
        }
       }
       return x;
    }
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,2,1};
int[] s = NextGreatest(arr);
for(int i=0;i<s.length;i++){
    System.out.print(s[i]+" ");
}
    }
}
