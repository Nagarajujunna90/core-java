import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class DuplicateElementsFromTwoArrays {
    public static void main(String[] args) {
        Integer[] int1={1,2,3,4,5};
        Integer[] int2={2,4,3,6};
        String[] strings1={"naga","raju","junna"};
        String[] strings2={"swetha","raju","junna"};

        Set<String> uniqueItems=new HashSet<>();
        Stream<String> concat = Stream.concat(Arrays.stream(strings1), Arrays.stream(strings2));
        concat.filter(i -> !uniqueItems.add(i))
                .forEach(System.out::println);

    }
}
