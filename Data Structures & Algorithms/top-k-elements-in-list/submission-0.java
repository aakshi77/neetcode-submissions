class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> cm=new HashMap<>();
        for(int num:nums){
            cm.put(num,cm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> minheap=new PriorityQueue<>(
            (n1,n2)->cm.get(n1)-cm.get(n2)
        );
        for(int num:cm.keySet()){
            minheap.add(num);

            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int res[]=new int[k];
        for(int i=0;i<k;i++){
            res[i]=minheap.poll();
        }
        return res;
    }
}
