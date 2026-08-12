class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();
          for (int x : nums) count.merge(x, 1, Integer::sum);

    // 2. Bucket by frequency: buckets[f] = numbers appearing f times                                                                                                                                      
    List<Integer>[] buckets = new List[nums.length + 1];                                                                                                                                                   
          for (var e : count.entrySet()) {
        int f = e.getValue();
        if (buckets[f] == null) buckets[f] = new ArrayList<>();
        buckets[f].add(e.getKey());
    }

    // 3. Walk buckets from highest frequency down, collect k
    int[] ans = new int[k];
    int idx = 0;
          for (int f = buckets.length - 1; f >= 0 && idx < k; f--) {
        if (buckets[f] == null) continue;
        for (int num : buckets[f]) {
            ans[idx++] = num;
            if (idx == k) break;
        }
    }       
          return ans;
    }
}
