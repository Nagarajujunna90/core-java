import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamplesWithoutCollectors {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(7, 13, 1, null, 3, 4, 5);
         integerList.stream().mapToInt(i->i).forEach(System.out::println);
        //integerList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        integerList.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
        int[] intArray = integerList.stream().mapToInt(c -> c).toArray();
        System.out.println(Arrays.toString(intArray));
        integerList.stream().sorted().forEach(System.out::println);
        integerList.stream().limit(1).forEach(System.out::println);
        integerList.stream().skip(2).forEach(System.out::println);
        integerList.stream().peek(System.out::println);

        //aggregate operation on stream
        int min = integerList.stream().mapToInt(i -> i).min().getAsInt();
        int max = integerList.stream().mapToInt(i -> i).max().getAsInt();
        int sum = integerList.stream().filter(s -> s % 2 == 0).mapToInt(i -> i).sum();
        double average = integerList.stream().mapToInt(i -> i).average().getAsDouble();
        long count = integerList.stream().count();
        System.out.println("min:" + min + " max:" + max + " sum:" + sum + " average:" + average + " count:" + count);

        //terminal operations
        integerList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        integerList.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);
        integerList.stream().findFirst().ifPresent(System.out::println);
        integerList.stream().findAny().ifPresent(System.out::println);
        boolean noneMatch = integerList.stream().noneMatch(f -> f.equals(1));
        boolean anyMatch = integerList.stream().anyMatch(f -> f.equals(1));
        boolean allMatch = integerList.stream().allMatch(f -> f.equals(1));
        System.out.println("noneMatch:"+noneMatch+" anyMatch:"+anyMatch+" allMatch:"+allMatch);

        integerList.forEach(System.out::println);

        integerList.stream().reduce(Integer::max).ifPresent(System.out::println);
        integerList.stream().reduce(Integer::min).ifPresent(System.out::println);


    }
}
