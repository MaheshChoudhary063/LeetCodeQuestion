class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double dig = 0d;
        int res = 0;
        for(int[] arr: dimensions) {
            int r = arr[0], c=arr[1];
            double curr= Math.sqrt(r*r+c*c);
            if(dig < curr){
                dig = curr;
                res = r*c;
            }else if(dig == curr){
                res = Math.max(res, r*c);
            }
        }
        return res;
    }
    }
    