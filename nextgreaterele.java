public class nextgreaterele {
    class Solution {
        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            HashMap<Integer,Integer> mp= new HashMap<>();
            Stack<Integer> st = new Stack<>();
            for(int num : nums2){
                while(st.size()>0 && st.peek() <= num){
                    mp.put(st.pop(),num);
                }
               st.push(num);  
            }
            int[] result=new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                result[i]=mp.getOrDefault(nums1[i],-1);
            }
            return result;
        }
    }
}
