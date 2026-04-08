class Solution {
    public boolean isAnagram(String s, String t) {
        boolean isAnagram = false;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        String sNew = new String(sChar);
        String tNew = new String(tChar);
        if(sNew.equals(tNew)) {
            isAnagram = true;
        }

        return isAnagram;

    }
}
