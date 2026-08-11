class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        if(s.length() != t.length()){return false;}

        for(int i =0;i<t.length();i++){
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0)-1);
            if(map.getOrDefault(t.charAt(i), 0) < 0) { return false;}
        }
            return true;
    }
}
