
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int v1=st.pop();
            int v2 = st.pop();
            if(M[v1][v2]==0){
                st.push(v1);
            }
            else if(M[v2][v1]==0){
                st.push(v2);
            }
        }
        if(st.size()==0) return -1;
        int po=st.pop();
        for(int i = 0 ;i < n ; i++){
            if(M[po][i]==1) return -1;
        }
        for(int j = 0 ;j<n;j++){
            if(j==po) continue;
            if(M[j][po]==0) return -1;
        }
        return po;
    }
}