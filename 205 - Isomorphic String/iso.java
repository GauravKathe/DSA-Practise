class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> mpS = new HashMap<>();
        HashMap<Character,Integer> mpT = new HashMap<>();
        int S=0;
        int T=0;
        for(int i=0;i<s.length();i++){

            if(!mpS.containsKey(s.charAt(i))){
                mpS.put(s.charAt(i),S++);
            }
            if(!mpT.containsKey(t.charAt(i))){
                mpT.put(t.charAt(i),T++);
            }

            if(!mpS.get(s.charAt(i)).equals(mpT.get(t.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}