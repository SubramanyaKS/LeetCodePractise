class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int l=1;
        int r=x/2;
        while(l<=r){
            int m = (l+r)/2;
            if((long)m*m>x){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return r;
        
    }
}