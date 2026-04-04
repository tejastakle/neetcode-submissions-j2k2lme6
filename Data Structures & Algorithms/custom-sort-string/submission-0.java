class Solution {
    public String customSortString(String order, String s) {
    
        
    Map<Character, Integer> rankOrder = new LinkedHashMap<>();
    for(int i=0; i<order.length(); i++) {
        rankOrder.putIfAbsent(order.charAt(i), i);
    }

    Map<Character, Integer> rankS = new LinkedHashMap<>();
    for(char c: s.toCharArray()) {
        rankS.put(c, rankS.getOrDefault(c,0) + 1);
    }

    StringBuilder result = new StringBuilder();

    for(char charA : rankOrder.keySet()) {
        if(rankS.containsKey(charA)) {
            int count = rankS.get(charA);
            for (int i=0;i<count;i++) {
                result.append(charA);
            }
            rankS.remove(charA);
        }
    }

    for(Map.Entry<Character,Integer> entry : rankS.entrySet()) {
        int count = entry.getValue();
        for(int i=0; i<count; i++) {
            result.append(entry.getKey());
        } 
    }

    String answer = result.toString();
    return answer;

        
        
    }
}