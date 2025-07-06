class Solution {

    public int peakElement(int[] arr) {
        // code here
        // O(n) TC
      /*
        for(int i=0;i<arr.length;i++){
            if((i==0 || arr[i-1]<arr[i]) && (i==arr.length-1 ||arr[i]>arr[i+1])) return i;   
        }
        return -1;
        */
        
        /* using if else -if and else condition
        if (arr.length == 0) return -1;
    if (arr.length == 1) return 0;
        for(int i=0;i<arr.length;i++){
        if(i==0){
            if( arr[i+1]<arr[i]){
                return  i;
            }
           
        }
        else if(i==arr.length-1){
if( arr[i-1]<arr[i]) return i;
        }
        
        else{
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i;
        }
    }
    return -1;
    */
        
    // otimal solution
    // TC --> O(logN)
    int n=arr.length;
    if(n==1) return 0;
     if(arr[0]>arr[1]) return 0;                         // ans considering for 1st and last value peak
     if(arr[n-1]>arr[n-2]) return n-1;
    int low=1,high=n-2;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return  mid;
        else if(arr[mid]>arr[mid-1]){
            low=mid+1;
        }
        else if(arr[mid]>arr[mid+1]){
            high=mid-1;
        }
    }
    return -1;    
        
    }
}
