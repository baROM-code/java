import java.util.Scanner;

public class upr7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scan.nextLine();
        Hi(name);
    }

    public static void Hi(String name)
    {
        System.out.println("Привет, " + name + "!");
    }
}