class Solution {
    public static int searchInsert(int[] nums, int target) {
        int i=0,j=nums.length-1,x=0;
        int mid=0;
            while(i<j){ 
                mid=(i+j)/2;
            if(nums[mid]==target){ 
            return mid;
            }

            else if (nums[mid]>target){
            j=mid-1;
            }

            else if(nums[mid]<target)
            i=mid+1;
            }
            System.out.println(mid);
                        // i=0;
                        // j=nums.length-1;
                        
                        // while(i<=j){ 
                        //     if(i==j)
                        //     {
                        //         if(nums[i]>target)
                        //         return i;
                        //         else if(nums[i]<target)
                        //         return i+1;
                        //     }


                        // else if(nums[0]>target)
                        //     return 0;

                        //     else if(nums[nums.length-1]<target)
                        //     return j+1;
                        //     while(i<j){ 
                        // if(nums[i]<target  && nums[j]>target){
                        //     i++;
                        //     j--;
                        //             } 
                        //     } 
                        //     return (i+j)/2;      
                        // }
                     return 0;
             }

    public static void main(String ar[]){
int arr[] = { 1,3,5,6};
searchInsert(arr,5);
    }
}