class Node implements Comparable<Node> {
    int val;
    int count;

    public Node(int val, int count) {
        this.val = val;
        this.count = count;
    }

    @Override
    public int compareTo(Node other) {
        if(other.count <= this.count) {
            return 1;
        }
        return -1;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length == 1) {
            return nums;
        }
        Map<Integer, Node> map = new HashMap();

        for(int i = 0; i < nums.length; i++) {
            Node n = map.getOrDefault(nums[i], new Node(nums[i], 0));
            n.count += 1;
            map.put(nums[i], n);
        }

        PriorityQueue<Node> pq = new PriorityQueue();

        for(Node n1: map.values()) {
            if(pq.size() < k) {
                pq.add(n1);
            } else {
                pq.add(n1);
                pq.poll();
            }
        }

        int[] result = new int[k];
        int j = 0;
        while(pq.size() > 0) {
            result[j] = pq.poll().val;
            j++;
        }
        return result;
    }
}
