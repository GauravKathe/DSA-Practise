class Solution {
    public String removeOuterParentheses(String s){
        StringBuilder sb = new StringBuilder();
        int opend=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(opend>=1){
                    sb.append(s.charAt(i));
                }
                opend++;
            }
            else{
                if(opend>=2){
                    sb.append(s.charAt(i));
                }
                opend--;
            }
        }
        return sb.toString();
    }
    /* Brute Force
    public String removeOuterParentheses(String s) {

        StringBuilder temp=new StringBuilder();
        StringBuilder result=new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            temp.append(s.charAt(i));
            if(s.charAt(i)=='('){
                stk.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && stk.peek()=='('){
                stk.pop();
            }
            if(stk.isEmpty()){
                result.append(temp.substring(1,temp.length()-1));
                temp.setLength(0);
            }
        }
        return result.toString();

    }*/

}