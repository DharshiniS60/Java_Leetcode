class Solution {
    public int findNumbers(int[] nums) {
         int count=0;
        for(int i:nums) {

            if (even(i)) {
               count++;
            }
        }
        return count;
    }
    public static boolean even(int i){
        int noofeven=finding(i);
        if(noofeven%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    //other way better time complexity
    public static int digitsfind2(int i){
        if(i<0){
            i=i*-1;
        }
        return (int)(Math.log10(i)+1);
    }
    public static int finding(int i){
        //for negative
        if(i<0){
            i=i*-1;
        }
        if(i ==0){
            return 1;
        }
        int count=0;
        while(i>0){
            count++;
            i/=10;

        }
        return count;
    }
}
