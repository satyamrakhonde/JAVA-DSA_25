package Arrays.mediumLevelQuestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MoveZerosUsingStream {

    public static void main(String[] args) {

        List<Integer> number = List.of(1, 0, -3, 0, 5, -2, 0, 8, 0, 4);

        List<Integer> result = Stream.concat(number.stream().filter(n -> n != 0),
                number.stream().filter(n -> n == 0)).collect(Collectors.toList());

        System.out.println(result);
    }

}
