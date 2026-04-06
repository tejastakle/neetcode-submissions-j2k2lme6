class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sNew = new String(c);
            if(!groups.containsKey(sNew)) {
                groups.put(sNew, new ArrayList<>());
            }
            groups.get(sNew).add(s);
        }

        return new ArrayList<>(groups.values());
        
    }
}
