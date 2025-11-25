import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,4,5,1);

        List<Integer> newList = list.stream().distinct().toList();

        System.out.println(newList);

        Optional<Integer> firstNo = list.stream().filter(n -> n > 3).findFirst();
        System.out.println(firstNo);

        List<empl> employee = Arrays.asList(new empl("asd", 100),new empl("qwe", 500), new empl("zxc", 300));

        List<empl> sorted = employee.stream().sorted(Comparator.comparing(empl::sal)).toList();
        System.out.println(sorted);
    }
    record empl(String name, Integer sal){}
}