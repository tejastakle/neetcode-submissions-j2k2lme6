class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        int answer = 0;

        for(int num : nums) {
            numbers.add(num);
        }

        for(int num : numbers) {
            if(!numbers.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                while(numbers.contains(currentNum + 1)) {
                    currentNum+=1;
                    currentStreak+=1;
                }
                answer = Math.max(answer, currentStreak);
            }
        }

        return answer;


        
    }
}
