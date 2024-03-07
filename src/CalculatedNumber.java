public class CalculatedNumber {
    public static void main(String[] args)
    {

        //  int sume = addNumbers (10, 20 );
        // System.out.println("Sum: " + sume);
        //   System.out.println( "Sume 2 : " + addNumbers(10,30));
        int x = 10;
        int y = 50;

        if (x > y)
        {
            System.out.println("Difference mit IF Else: " + subNumb(x, y));
        } else
        {
            System.out.println("sume double mit if else: " + addNumbers2(x, y));
        }


        geradeUngerade(7 );
        String originalStr = "Ana";
        Reverse(originalStr);
       // System.out.println("Gerade oder ungerade: " + geradeUngerade(9));
        System.out.println("sume double: " + addNumbers2(10.58, 25.65));
        System.out.println("Difference: " + subNumb(90.58, 25.65));
        System.out.println("Positive Num. : " + makePositive(9));
    }

    /*
        public static int addNumbers (int a, int b)
        {
            int sume = a+b;
            return sume;
        }
    */
    public static double addNumbers2(double a, double b)
    {
        double sume = a + b;
        return sume;
    }


    public static double subNumb(double a, double b)
    {
        double difference = a - b;
        return difference;
    }

    public static int makePositive(int a)
    {
        if (a < 0)
        {
            return a * -1;
        }
        return a;
    }

    public static void geradeUngerade(int a)
    {
        if (a % 2 == 0)
        {
            System.out.println("Es ist gerade: " + a);
        }
        else
        {
            System.out.println("Es ist ungerade und verdoppelt: " + a*2);
        }
    }

public static void Reverse (String s)
{
    String reversedStr = "";

    for (int i = 0; i < s.length(); i++)
    {
        reversedStr = s.charAt(i) + reversedStr; ////extracts each character
    }
    System.out.println("Reversed string: " + reversedStr);
    if (reversedStr.compareToIgnoreCase(s)<1)
    {
        System.out.println("es ist palindrome");
    } else
    {
        System.out.println("es ist NICHT palindrome");
    }
}
}

