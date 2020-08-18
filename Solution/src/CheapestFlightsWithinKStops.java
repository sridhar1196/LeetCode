import java.util.PriorityQueue;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        int[][] t = new int[n][n];
        for(int[] flight: flights){
            t[flight[0]][flight[1]] = flight[3];
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> a[0]-b[0]);
        heap.offer(new int[]{0, src, K+1});

        while(!heap.isEmpty()){
            int[] cur = heap.poll();
            int price = cur[0], place = cur[1], remainStop = cur[2];
            if(place == dst){
                return price;
            }
            if(remainStop > 0){
                for(int i=0;i<n;i++){
                    if(t[place][i] > 0){
                        heap.offer(new int[]{price+t[place][i], i, remainStop-1});
                    }
                }
            }
        }
        return -1;
    }
}
