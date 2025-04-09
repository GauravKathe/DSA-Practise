class Solution {
    //brute force directly use Collections framework sort function
    public String frequencySort(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }

        ArrayList<Character> ls = new ArrayList<>(mp.keySet());
        ls.sort((a,b)->mp.get(b)-mp.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c:ls){
            for(int i=0;i<mp.get(c);i++){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}