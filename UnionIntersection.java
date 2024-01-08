import java.util.*;
public class UnionIntersection {
        public int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set=new HashSet<>();
            for(int num:nums1){
                set.add(num);
            }
    
            HashSet<Integer> newSet=new HashSet<>();
            for(int num1:nums2){
                if(set.contains(num1)){
                    newSet.add(num1);
                }
            }
    
            int[] arr=new int[newSet.size()];
            int i=0;
            for(int num:newSet){
                arr[i++]=num;
            } 
        return arr;
        }

}
