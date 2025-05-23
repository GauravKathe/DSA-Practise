class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(' ||s.charAt(i)=='[' || s.charAt(i)=='{'){
                stk.push(s.charAt(i));
            }

            else {
                if(stk.isEmpty()) return false;
                if(s.charAt(i)==')' && stk.peek()=='(' ||
                        s.charAt(i)==']' && stk.peek()=='['||
                        s.charAt(i)=='}' && stk.peek()=='{' )
                {
                    stk.pop();
                }
                else return false;

            }

        }
        if(stk.isEmpty()) return true;
        else return false;

    }
}