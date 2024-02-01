package Default;

public interface One
{
    default void run()
    {
        System.out.println("I'm Running...");
    }
    public void talk();
}
