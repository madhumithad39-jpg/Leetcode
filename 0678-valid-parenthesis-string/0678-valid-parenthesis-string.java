class Solution {
    public boolean checkValidString(String s) {
        int openend=0,closed=0;
        char [] brackets =s.toCharArray();
        for(char each:brackets){
            if(each=='('){
                openend++;
                closed++;
            }
            else if(each==')'){
                if(openend>0) openend--;
                closed--;
            }
            else {
                 if(openend>0) openend--;
                closed++;
            }
            if(closed<0) return false;
        }
        return openend==0;
    }
}