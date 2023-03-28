package JavaCore.HomeWork.StreamAPIFirst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Main main = new Main();
        main.sortedList(intList);
    }

    void sortedList(List<Integer> list) {
        List<Integer> sortList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0) {
                sortList.add(list.get(i));
            }
            Collections.sort(sortList);
        }
        for (Integer i : sortList) {
            System.out.print(i + " ");
        }
    }
}
