import java.util.Scanner;

public class upr6 {

   public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите целое число");
            int a = scan.nextInt();
            System.out.println(isBellowZero(a));

        }

   public static boolean isBellowZero(int a)
        {
            if (a >= 0 )
                return true;
            else
                return false;
        }

    }

