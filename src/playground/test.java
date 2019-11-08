package playground;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Integer[] rec1 = {1,2,3};
        Integer[] rec2 = {2,3,4};

        ArrayList<Integer[]> list = new ArrayList<>();

        list.add(rec1);
        list.add(rec2);

        System.out.println(Boundary.getBoundary(list));
    }
}
