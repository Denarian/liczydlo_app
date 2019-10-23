package pl.edu.pk.it.jgrodny.to.lab1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        I_liczydlo test = new Liczydlo(5,5);
        System.out.println("A = 5, B = 5");
        System.out.println(test.dodaj());
        System.out.println(test.odejmij());
        System.out.println(test.pomnoz());
        System.out.println(test.podziel());

        test = new Liczydlo(5,0);
        System.out.println("A = 5, B = 0");
        System.out.println(test.dodaj());
        System.out.println(test.odejmij());
        System.out.println(test.pomnoz());
        System.out.println(test.podziel());
    }
}
