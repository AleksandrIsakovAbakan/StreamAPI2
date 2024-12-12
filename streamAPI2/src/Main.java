import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Integer> ints =List.of(1, 0, 5, 8, 9, 15, 26, 48, 96, 155, 999, -5, -55, -48);
        System.out.println(calculatingSumOfAllEvenAndOddNumbersInList(ints));

        List<String> stringsList = Arrays.asList("bacon", "beef", "chicken", "duck", "ham", "lamb",
                "liver", "meat", "liver", "meat");
        System.out.println(removingAllDuplicateElementsFromList(stringsList));
    }

    /*
    Напишите программу для вычисления суммы всех четных и нечетных чисел в списке с использованием потоков.
    */
    public static Map<Boolean, Integer> calculatingSumOfAllEvenAndOddNumbersInList(List<Integer> list){

        return list.stream()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0, Collectors.summingInt(Integer::intValue)));
    }

    /*
    Напишите программу для удаления всех повторяющихся элементов из списка с помощью потоков.
    */
    public static List<String> removingAllDuplicateElementsFromList(List<String> list){

        return list.stream()
                .distinct()
                .toList();
    }
}
