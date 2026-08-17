class Solution {
    public boolean isPalindrome(String s) {
        String str = new String("");
        for(int i = 0; i<s.length(); i++){
            boolean isAlphanumeric = Character.isLetterOrDigit(s.charAt(i));
            if(isAlphanumeric){
                str +=Character.toLowerCase(s.charAt(i));
            }
        }
        int r = 0;
        int l = str.length()-1;
        while(r<l){
            if(str.charAt(r)!=str.charAt(l)) return false;
            r++;
            l--;
        }
        return true;
    }
}
