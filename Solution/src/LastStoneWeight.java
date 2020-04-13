import java.util.PriorityQueue;

public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
        for(int stone: stones){
            pq.add(stone);
        }
        int first = 0;
        while (!pq.isEmpty()){
            first = pq.poll();
            if(!pq.isEmpty()){
                int temp = pq.poll();
                if(temp == first){
                    first = 0;
                } else {
                    pq.add(first - temp);
                }
            }
        }
        return first;
    }
}
