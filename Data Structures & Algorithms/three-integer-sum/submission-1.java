class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();
        int[] sortedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedArray);
        int length = sortedArray.length;
        for(int i=0;i<length;i++) {
            int left = i+1;
            int right = length - 1;
            while(left<right) {
                int result = sortedArray[i] + sortedArray[left] + sortedArray[right];
                if(result == 0) {  
                    answer.add(Arrays.asList(sortedArray[i],sortedArray[left],sortedArray[right]));
                    left+=1;
                    right-=1;
                    while(left<right && sortedArray[left] == sortedArray[left - 1]) {
                        left+=1;
                    }                   
                } else if(result<0) {
                    left+=1;
                } else {
                    right-=1;
                }
                if(sortedArray[i] == sortedArray[i+1]) {
                    i+=1;
                }
            }
        }
        return answer;
        
        
    }
}
