class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> v= new HashSet<>();
        v.add('a'); v.add('e'); v.add('i'); v.add('u'); v.add('o');
        v.add('A'); v.add('E'); v.add('I'); v.add('U'); v.add('O');

        int length=s.length();
        int m=length/2;

        String first=s.substring(0,m);
        String sec=s.substring(m);
        return cV(first,v)==cV(sec,v);

    }
    private int cV(String str,Set<Character> v){
       int count = 0;
        for (char c : str.toCharArray()) {
            if (v.contains(c)) {
                count++;
            }
        }
        return count;
    }
}