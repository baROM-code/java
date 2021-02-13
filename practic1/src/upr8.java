import java.util.Scanner;

public class upr8 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите год");
        int a = scan.nextInt();
        visYear(a);
    }

    public static void visYear(int a)
    {
        String vis = "не високосный";
        if (a%4 == 0 & a%100 != 0) vis = "високосный";
        if (a % 400 == 0) vis = "високосный";
        System.out.println("Это " + vis + " год");
    }

}
