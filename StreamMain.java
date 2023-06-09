package JavaCore.HomeWork.StreamAPIFirst;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        integerList.stream()
                .filter(value -> value > 0)
                .filter(value -> value % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(x -> System.out.print(x + " "));
    }
}
