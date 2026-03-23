// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
       
        int zerosCount = 0;
        int onesCount = 0;
        
        for(int i=0;i<arr.length;i++){
        if(arr[i]==0) zerosCount++;
        else onesCount++;
        }
        for(int i=0;i<zerosCount;i++){
          arr[i] = 0;
        }
        for(int i=zerosCount;i<arr.length;i++){
            arr[i] = 1;
        
        }
        // Second Approch
        //Arrays.sort(arr);
    
    }
}
