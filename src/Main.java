public class Main {


    public static void main(String[] args){
        System.out.println("Hello world");
        //Ganzzahlen

        int age = 33;
        long longNumber = 10000000000000L;

        //FLießkommerzahlen

       float floaat = 3.9f;
       double sa = 32.5656958565455;




       boolean isSunny = true;
       boolean isRainy = false;

       char firstletter = 'f';

       String name = "sanela sani";
int bron = 5;
int sum = age + bron;

System.out.println(sum);


boolean isgrosser = age>bron;
boolean isgleich = age >0 || bron >0;
boolean istnicht = !(age<bron);
        System.out.println("das ist " + age + " +" + isgrosser);
        System.out.println(String.format("die summe ist %d", sum));
        System.out.println(istnicht);
    }
}

