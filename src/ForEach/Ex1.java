package ForEach;

import java.util.ArrayList;
import java.util.List;

public class Ex1
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Parth");
        list.add("Java");
        list.add("CPP");

        list.forEach(st -> System.out.println(st));

    }
}
