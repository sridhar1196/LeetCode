import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        HashMap<Integer,Integer> visited = new HashMap<>();
        HashMap<Integer,HashMap<Integer,Integer>> newlyRotten = new HashMap<>();
        int fresh = 0;
        int min = 0;
        for(int i=0;i<grid.length;i++){
            HashMap<Integer,Integer> temp = new HashMap<>();
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    fresh++;
                } else if(grid[i][j] == 2){
                    temp.put(j,1);
                }
            }
            if(temp.size() > 0){
                newlyRotten.put(i,temp);
            }
        }
        while(newlyRotten.size() > 0){
            System.out.println(newlyRotten);
            HashMap<Integer,HashMap<Integer,Integer>> temp1 = new HashMap<>();
            boolean rottenChange = false;
            for (int i : newlyRotten.keySet()) {
                HashMap<Integer, Integer> y = newlyRotten.get(i);
                for(int j : y.keySet()){
                    if(j+1 < grid[0].length && grid[i][j+1] == 1){
                        fresh--;
                        rottenChange = true;
                        grid[i][j+1] = 2;
                        if(temp1.containsKey(i)){
                            HashMap<Integer,Integer> temp2 = temp1.get(i);
                            temp2.put(j+1,1);
                        } else {
                            HashMap<Integer,Integer> temp2 = new HashMap<>();
                            temp2.put(j+1,1);
                            temp1.put(i,temp2);
                        }
                    }
                    if(j-1 >= 0 && grid[i][j-1] == 1){
                        fresh--;
                        rottenChange = true;
                        grid[i][j-1] = 2;
                        if(temp1.containsKey(i)){
                            HashMap<Integer,Integer> temp2 = temp1.get(i);
                            temp2.put(j-1,1);
                        } else {
                            HashMap<Integer,Integer> temp2 = new HashMap<>();
                            temp2.put(j-1,1);
                            temp1.put(i,temp2);
                        }
                    }
                    if(i+1 < grid.length && grid[i+1][j] == 1){
                        fresh--;
                        rottenChange = true;
                        grid[i+1][j] = 2;
                        if(temp1.containsKey(i+1)){
                            HashMap<Integer,Integer> temp2 = temp1.get(i+1);
                            temp2.put(j,1);
                        } else {
                            HashMap<Integer,Integer> temp2 = new HashMap<>();
                            temp2.put(j,1);
                            temp1.put(i+1,temp2);
                        }
                    }
                    if(i-1 >= 0 && grid[i-1][j] == 1){
                        fresh--;
                        rottenChange = true;
                        grid[i-1][j] = 2;
                        if(temp1.containsKey(i-1)){
                            HashMap<Integer,Integer> temp2 = temp1.get(i-1);
                            temp2.put(j,1);
                        } else {
                            HashMap<Integer,Integer> temp2 = new HashMap<>();
                            temp2.put(j,1);
                            temp1.put(i-1,temp2);
                        }
                    }
                }
            }
            if(rottenChange){
                min++;
            }
            newlyRotten = temp1;
            System.out.println(temp1);
        }
        if(fresh > 0){
            return -1;
        } else {
            return min;
        }
    }
}
