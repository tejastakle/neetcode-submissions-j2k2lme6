class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> uniqueChars = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right=0;right<s.length();right++) {
            while(uniqueChars.contains(s.charAt(right))) {
                uniqueChars.remove(s.charAt(left));
                left++;
            }

            uniqueChars.add(s.charAt(right));
            maxLength = Math.max(right-left+1,maxLength);
        }

        return maxLength;
        
    }
}
