class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums) {
            count.put(num, count.getOrDefault(num,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        for(Map.Entry<Integer,Integer> entry : count.entrySet()) {
            minHeap.add(entry);

            if(minHeap.size()>k) {
                minHeap.poll();
            }

        }

        int[] answer = new int[k];
        for(int i=0;i<k;i++) {
            answer[i] = minHeap.poll().getKey();
        }

        return answer;


        
    }
}
