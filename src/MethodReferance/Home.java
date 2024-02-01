package MethodReferance;

public class Home
{
    public static void main(String[] s)
    {
        One one = new Two()::talk;
        one.talk();
    }
}
