package Lamda.Ex1;

public class MultipleLine
{
   public static void main(String s[])
   {
        LamdaInterface lamdaInterface= ()->{
            System.out.println("Demo Statement 1");
            System.out.println("Demo Statement 2");
            System.out.println("Demo Statement 3");

        };
        lamdaInterface.demo();

   }

}
