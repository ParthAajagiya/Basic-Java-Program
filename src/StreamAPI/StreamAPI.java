package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI
{
    public static void main(String s[])
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(52);
        list.add(4);
        list.add(15);
        list.add(471);
        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        Stream<Integer> s3 = s2.map(n -> n % 2);
        Integer reduce = s3.reduce(0, (c, e) -> c + e);
        System.out.println("ok");
        System.out.println("-----------------------------");
        list.forEach(n -> System.out.println(n));


    }
}
