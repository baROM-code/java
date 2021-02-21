import java.util.Scanner;

public class upr5 {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число");
        int a = scan.nextInt();
        bellowZero(a);

    }

    public static void bellowZero(int a)
    {
        if (a >= 0 )
            System.out.println("Это положительное цисло");
        else
            System.out.println("Это отрицательное цисло");
    }

}
