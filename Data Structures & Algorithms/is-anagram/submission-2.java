class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> str = new HashMap();
        for (int i = 0; i < s.length(); i++) {
            if (str.containsKey(s.charAt(i))) {
                str.put(s.charAt(i), str.get(s.charAt(i)) + 1);
            } else {
                str.put(s.charAt(i), 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (str.containsKey(t.charAt(i))) {
                str.put(t.charAt(i), str.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (str.get(s.charAt(i)) != 0)
                return false;
        }
        return true;
    }
}