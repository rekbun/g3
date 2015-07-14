public class Solution {
static int max(int []arr) {
    int ms=0;
    int mm=0;
    for(int i=0;i<arr.length;i++) {
        ms= ms + arr[i];
        if(ms<0) {
            ms=0;
        }
        if(ms>mm) {
            mm=ms;
            
        }
    }
    return mm;
}

    public static void main(String[] args) {
        int[] arr= {-1,2,-1,4,-5};
        System.out.println(max(arr));
    }
}
