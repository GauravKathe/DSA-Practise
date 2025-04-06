class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0) return "";

        StringBuilder sb = new StringBuilder();
        String first=strs[0];

        for(int i=0;i<first.length();i++){
            char c = first.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=c){
                    return sb.toString();
                }
            }
            sb.append(c);
        }
        return sb.toString();
    }
}