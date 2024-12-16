import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringExampleWithStreams {
    public static void main(String[] args) {
        String str = "nagarajuu";
//        str.chars().mapToObj(i -> (char) i).max(Comparator.naturalOrder()).ifPresent(System.out::println);
//        str.chars().mapToObj(i -> (char) i).min(Comparator.naturalOrder()).ifPresent(System.out::println);
//        long count = str.chars().mapToObj(i -> (char) i).count();
//        System.out.println(count);
//        str.chars().mapToObj(i->(char)i).forEach(System.out::println);
        Map<String, Long> collect = str.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(character -> Character.toString(character), Collectors.counting()));
        System.out.println(collect);
       // str.chars().mapToObj(i->(char)i).sorted().distinct().forEach(System.out::println);
         collect.entrySet().stream().filter(c -> c.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.joining(","));



    }
}
