class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false; // edge consdition if both length dosen't

        HashMap<Character,Integer> mp = new HashMap<>();

        //now put each element in map so if element is not present the ut at 0+1 and if      present then a->1 the update a->1+1 i.e a->2
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        //to check on t in map or not
        for(int i=0;i<t.length();i++){
            if(!mp.containsKey(t.charAt(i))) return false; // not present then false

            mp.put(t.charAt(i),mp.get(t.charAt(i))-1); //if there decrement the index by 1

            if(mp.get(t.charAt(i))<0) return false; // and after decrementing its value is not equal to 0 hen false
        }
        return true;
    }

}