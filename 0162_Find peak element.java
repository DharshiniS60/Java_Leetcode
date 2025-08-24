class Solution {
    public int findPeakElement(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) { // says you ar in the incresing ascending order so
                end = mid; // heremid value also considered beacuse of the possibilty
                //conside[ 3,4, 5,6,2,1] arr[mid]=5 then arr[mid+1]=6 which is greater so,end =mid ,that directly says that end is the mid and return to the while loop and check bs in satrt to mid
            }
            //or you or in decresing decending order
            else {
                start = mid + 1;// you can leave the mid element beacuse it obviously greater
                // consider same array that now checks from 6 to 1 that the 6 also added
            }
        }
        //in the end ,start ==end  and pointinh to the largest elemnt in the arary becausse of those 2 condition checked above
        //start and end always try to find the max elemnt in  the above 2 checks
        //hence when they are pointing to one element ,that is the peak element
        //at everey  point of start and end,they have the best possible answer til that time
        // and if are saying that only one itm remains, then that is the possible answer
        return start;
    }
}
