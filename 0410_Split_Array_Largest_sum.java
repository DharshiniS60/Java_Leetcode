
//binar search
class Solution {
    public int splitArray(int[] nums, int k) {
        int start=0;
        int end=0;
        int m=k;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]); // means that max element in an array --> that lower bound for bs --> which has max element in the array ie., the min possible
            end += nums[i]; // sum of the array --> max value-->upper bound of bs
        }
        //bs
        while(start <end){
            //try for the middle as potential answer
            int mid=start+(end-start )/2;
            //calculate how many pieces (count) that the array can split with this max sum
            int sum=0;
            int pieces=1; //initially 1  given in question
            for(int num :nums){
                if(sum + num >mid){
                    //you cannit  add this in the existing subarray, make new array
                    // say you add this num in new subarray,then sum=num
                    // sum for new array start with the num as sum not 0 as 1st array
                    sum =num;
                    pieces++; // next sub array
                }
                else{ //if not
                    sum+=num;
                }
            }
            if(pieces >m){ //m=2
                start=mid+1;

            }
            else{
                end=mid;
            }

        }
        return start; // or end bouth are ==
    }
    
}
