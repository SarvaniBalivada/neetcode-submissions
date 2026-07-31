class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>>pq=new PriorityQueue<>(
            (a,b)->{
                return b.getValue()-a.getValue();
            }
        );

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            pq.offer(e);
        }

        int[] ans=new int[k];
        int idx=0;
        while(!pq.isEmpty() && idx<k){
            Map.Entry<Integer,Integer>temp=pq.poll();
            int key=temp.getKey();
            int val=temp.getValue();


            ans[idx++]=key;
        }

        return ans;
    }
}
