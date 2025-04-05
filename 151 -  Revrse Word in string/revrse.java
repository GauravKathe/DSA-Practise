class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '){
                continue;
            }
            end =i; // char found the set end = i;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(sb.length()>0){
                sb.append(' ');
            }
            sb.append(s.substring(i+1,end+1)); // why end +1 because in substrinf end is exaclueded
        }
        return sb.toString();
    }
}