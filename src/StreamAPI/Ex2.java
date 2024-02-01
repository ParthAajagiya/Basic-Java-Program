package StreamAPI;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex2
{
    public static void main(String s[])
    {
        Set<Integer> num = new HashSet<>();
        num.add(5);
        num.add(4);
        num.add(8);
        num.add(2);num.add(1);
        System.out.println("parth");
        Stream<Integer> stream = num.stream( );
        Stream<Integer> objectStream = stream.filter(n -> n % 2 != 0)
                .map(n -> n * 2)
                .sorted((o1, o2) -> o2.compareTo(o1));
//        Integer reduce = objectStream.reduce(0, (c, e) -> c + e);


        objectStream.forEach(n -> System.out.println(n));
    }
}
