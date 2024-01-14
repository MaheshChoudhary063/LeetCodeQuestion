class Solution {
    public List<Integer> beautifulIndices(String s, String a, String b, int k) {
        ArrayList<Integer> al= new ArrayList<>();
        ArrayList<Integer> bl= new ArrayList<>();
        if(a.length()>s.length() || s.length()<b.length()){
            return al;
        }
         for(int i =0 ;i<=s.length()-b.length();i++){
            if(s.substring(i,i+b.length()).equals(b)){
                bl.add(i);
            }
        }
        for(int j =0 ;j<=s.length()-a.length();j++){
            if(s.substring(j,j+a.length()).equals(a)){
                for(int m =0 ;m<bl.size();m++){

                     if(Math.abs(bl.get(m)-j)<=k){
                        al.add(j);
                        break;
                    }
                }
            }
        }
        return al;
        
        
    }
}
