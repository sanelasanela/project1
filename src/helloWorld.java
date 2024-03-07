public class helloWorld
{
    public static void main(String[] args)
    {
        System.out.println("JAva is cool");

        int a =10;
        int b =60;
        int sum = a+b;
        System.out.println("Sum von a und b ist: " + sum);

        System.out.println("Subtraction von a und b ist: " + (a-b));
        System.out.println("multiplication von a und b ist: " + (a*b));
        System.out.println("division von a und b ist: " + (a/b));

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);

        float x = 1.1f;
        double y = 22.222222222222;

        System.out.println(x>y);
        System.out.println(x<y);
        System.out.println(x==y);

        if (a > b)
        {
            System.out.println("a ist grösser als b");
        } else if (a==b)
        {
            System.out.println("a ist gleich  b");
        } else
        {
            System.out.println("a ist kleiner als b");
        }


        sayHello();
        sayHello2("saani");
        String name = "max";
        sayHello3(name);

     //   int sume = addNumbers (10, 20 );
      //  System.out.println(sume);
    //    System.out.println(addNumbers(10,30));
}

    public static void sayHello()
    {
    System.out.println("hello aus neue funktion");
    }
    public static void sayHello2(String sanela2)
    {
        System.out.println("hello aus neue 2 funktion " + sanela2);
    }

    public static void sayHello3(String sanela3)
    {
        System.out.println("hello aus neue 3 funktion " + sanela3);
    }



}


