package DateAndTime;

import java.util.Date;

public class DateEx
{
    public static void main(String s[])
    {
        Date d = new Date();
        System.out.println(d.getDate());
        System.out.println(d.getDay());
        System.out.println(d.getTime());

        System.out.println(d.getYear()+1900); //It counts Year from 1900 so we have to add+1900
        System.out.println(d.getMonth()+1); //Count month from 0



    }
}
