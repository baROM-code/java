import java.util.Scanner;

public class upr4 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();

        System.out.println(number10to20(a, b));
    }

    public static boolean number10to20 (int a, int b)
    {
        boolean res = false;
        if ( a+b >= 10 & a+b <= 20) res = true;
        return res;
    }

}
