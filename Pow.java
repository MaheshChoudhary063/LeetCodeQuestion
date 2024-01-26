public class Pow {
    class Solution {
        public double myPow(double x, int n) {
            // if(n == 0){
            //     return 1;
            // }
            // if(n > 0){
            // double res = myPow(x,n-1);
            // return x*res;
            // }
            // if(n < 0){
            //    double res=myPow(x,n+1);
            //    return res/x; 
            // }
            // return 0 ; 
            return Math.pow(x,n);
        }
    
    }
}
