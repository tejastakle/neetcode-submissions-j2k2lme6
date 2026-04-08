class Solution {
    public boolean isPalindrome(String s) {
        String filtered = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        boolean isPalindrome = true;
        int length = filtered.length();
        for(int i=0;i<length/2;i++) {
            char start = filtered.charAt(i);
            char end = filtered.charAt(length-1-i);
            if (start!=end) {
                isPalindrome = false;
            }
        }

        return isPalindrome;
        
    }
}
