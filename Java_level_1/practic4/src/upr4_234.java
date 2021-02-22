import java.util.Random;
import java.util.Scanner;

public class upr4_234
{
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args)
    {
        initMap();
        printMap();
        while (true)
        {
            humanTurn();
            printMap();
            if (checkWin(DOT_X))
            {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull())
            {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O))
            {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }
    public static boolean checkWin(char symb)
    {
        int summLine = 0;
        int summColumn = 0;
        int summDiagL = 0;
        int summDiagR = 0;

        for (int i = 0; i < SIZE; i++)
        {
            if (map[i][i] == symb ) summDiagL++;
            if (map[SIZE-i-1][i] == symb ) summDiagR++;
            for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == symb ) summLine++;
                if (map[j][i] == symb ) summColumn++;
            }
            if (summLine == DOTS_TO_WIN || summColumn == DOTS_TO_WIN) return true;
            summLine = 0;
            summColumn = 0;
        }
        if (summDiagL == DOTS_TO_WIN || summDiagR == DOTS_TO_WIN) return true;
        return false;
    }
    public static boolean isMapFull()
    {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn()
    {
        int x, y;
        int x1 = -1, y1 = -1;
        int x2 = -1, y2 = -1;

        // Умный ход
        int summLine = 0;
        int summColumn = 0;
        int summDiagL = 0;
        int summDiagR = 0;

        // проверяем строки и столбцы
        for (int i = 0; i < SIZE; i++)
        {
             for (int j = 0; j < SIZE; j++)
            {
                if (map[i][j] == DOT_X ) summLine++;
                if (map[i][j] == DOT_EMPTY )
                {
                    x1 = j; y1 = i;
                }
                if (map[j][i] == DOT_X ) summColumn++;
                if (map[j][i] == DOT_EMPTY )
                {
                    x2 = i; y2 = j;
                }
                if (summLine == DOTS_TO_WIN-1 && x1 + y1 >= 0 && isCellValid(x1, y1))
                {
                    System.out.println("Компьютер подумал и походил в точку " + (x1 + 1) + " " + (y1 + 1));
                    map[y1][x1] = DOT_O;
                    return;
                }
                if (summColumn == DOTS_TO_WIN-1 && x2 + y2 >= 0 && isCellValid(x2, y2))
                {
                    System.out.println("Компьютер подумал и походил в точку " + (x2 + 1) + " " + (y2 + 1));
                    map[y2][x2] = DOT_O;
                    return;
                }
            }
            summLine = 0;
            x1 = y1 = -1;
            summColumn = 0;
            x2 = y2 = -1;
        }
        // проверяем диагонали
        x1 = y1 = -1;
        x2 = y2 = -1;
        for (int i = 0; i < SIZE; i++)
        {
           if (map[i][i] == DOT_X ) summDiagL++;
           if (map[i][i] == DOT_EMPTY )
              {
                x1 = i; y1 = i;
              }
           if (map[SIZE-i-1][i] == DOT_X) summDiagR++;
           if (map[SIZE-i-1][i] == DOT_EMPTY )
             {
                x2 = i; y2 = SIZE-i-1;
             }
            if (summDiagL == DOTS_TO_WIN-1 && x1 + y1 >= 0 && isCellValid(x1, y1))
            {
                System.out.println("Компьютер подумал и походил в точку " + (x1 + 1) + " " + (y1 + 1));
                map[y1][x1] = DOT_O;
                return;
            }
            if (summDiagR == DOTS_TO_WIN-1 && x2 + y2 >= 0 && isCellValid(x2, y2))
            {
                System.out.println("Компьютер подумал и походил в точку " + (x2 + 1) + " " + (y2 + 1));
                map[y2][x2] = DOT_O;
                return;
            }
        }

        // Случайный ход
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn()
    {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y)
    {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
    public static void initMap()
    {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }
    public static void printMap()
    {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
