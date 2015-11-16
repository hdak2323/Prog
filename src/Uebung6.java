/**
 * Created by sebb on 11/16/15.
 */
public class Uebung6 {

    // Aufgabe 1 (Platzhalter)
    public static double PiAnnaeherung(int rechtecke)
    {
        return 0;
    }

    // Aufgabe 2 a
    public static int round(double in)
    {
        int num = (int)in;
        return (in - num) < 0.5 ? num : ++num;
    }

    // Aufgabe 2 b
    public static double round(double in, int precision)
    {
        in *= pow(10, precision);

        return ((long)in) / (double)pow(10, precision);
    }

    // Helfer zu 2b
    public static int pow(int base, int exp)
    {
        int res = 1;

        for (int i = 0; i < exp; i++)
            res *= base;

        return res;
    }

    // Aufgabe 3
    public static int fakultaet(int base)
    {
        int res = base;
        while(--base > 0)
            res *= base;

        return res;
    }

    // Aufgabe 4
    public static void Dreieck(int hoehe)
    {
        for (int i = 1; i <= hoehe; i++) {
            System.out.println(
                new String(new char[hoehe-i]).replace("\0", " ") +
                new String(new char[i*2]).replace("\0\0", "* ")
            );
        }
    }
}
