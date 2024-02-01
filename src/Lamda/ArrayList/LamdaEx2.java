package Lamda.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LamdaEx2
{
    public static void main(String s[])
    {
        ArrayList<Data> name = new ArrayList<>();
        name.add(new Data("Parth"));
        name.add(new Data("Java"));
        name.add(new Data("C++"));

//        Collections.sort(name, new Comparator<Data>() {
//            @Override
//            public int compare(Data o1, Data o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//                          Lamda Expression
        Collections.sort(name,(Data o1,Data o2)->
                {
                    return o1.getName().compareTo(o2.getName());
                }
                );

        for(Data data:name)
        {
            System.out.println("name "+ data.getName());
        }

        name.forEach(n -> System.out.println(n));
    }
}
