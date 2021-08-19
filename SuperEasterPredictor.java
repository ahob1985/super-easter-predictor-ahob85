import java.util.Scanner;

/**
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperEasterPredictor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Easter Predictor");
        System.out.println("By: Hidden Genius");
        System.out.print("Please enter a year greater than 1582: ");
        int y = Integer.parseInt(sc.nextLine());
        //System.out.println("y = " + y);
        int a = y % 19;
        //System.out.println("a = " + a);
        int b = y / 100;
        //System.out.println("b = " + b);
        int c = y % 100;
        //System.out.println("c = " + c);
        int d = b / 4;
        //System.out.println("d = " + d);
        int e = b % 4;
        //System.out.println("e = " + e);
        int f = (b + 8) / 25;
        //System.out.println("f = " + f);
        int g = (b - f + 1) / 3;
        //System.out.println("g = " + g);
        int h = (19 * a + b - d - g + 15) % 30;
        //System.out.println("h = " + h);
        int i = c / 4;
        //System.out.println("i = " + i);
        int k = c % 4;
        //System.out.println("k = " + k);
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        //System.out.println("r = " + r);
        int m = (a + 11 * h + 22 * r) / 451;
        //System.out.println("m = " + m);
        int n = (h + r - 7 * m + 114) / 31;
        //System.out.println("n = " + n);
        int p = (h + r - 7 * m + 114) % 31;
        //System.out.println("p = " + p);
        int day = p + 1;
        System.out.println("In " + y + ", Easter falls on " + n + "/" + day + ".");
        System.out.println("Thank you! Goodbye!");
    }
}
