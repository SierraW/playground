package playground;

import java.util.*;

public class Boundary {
    public static ArrayList<Integer> getBoundary(ArrayList<Integer[]> rectangles) {
        Map<Integer, Integer> heightMap = new HashMap<>();

        for (Integer[] rectangle: rectangles) {
            for (int i = rectangle[0]; i <= rectangle[2]; i++) { //if not exist, data put in map.
                if (!heightMap.containsKey(i)) {
                    heightMap.put(i, rectangle[1]);
                } else if (heightMap.get(i) < rectangle[1]){ // if exist, check higher
                    heightMap.replace(i, rectangle[1]);
                }
            }
        }

        ArrayList<Integer> keys = new ArrayList<>(heightMap.keySet());
        Collections.sort(keys, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        //output
        int previousHeight = 0;
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer key : keys) {
            Integer currentHeight = heightMap.get(key);
            if (currentHeight > previousHeight) {
                result.add(key);
                result.add(currentHeight);
                previousHeight = currentHeight;
            }
        }
        return result;
    }
}
