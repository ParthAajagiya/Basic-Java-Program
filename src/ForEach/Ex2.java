package ForEach;

import java.util.ArrayList;
import java.util.List;

public class Ex2
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(7);

        list.forEach(no -> System.out.println(no));
    }
}
