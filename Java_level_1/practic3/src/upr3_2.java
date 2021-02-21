import java.util.Random;
import java.util.Scanner;

public class upr3_2 {

    public static String aiword;


    public static void main(String[] args)
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Random rand = new Random();
        aiword = words[rand.nextInt(words.length)];

        //System.out.println(aiword);
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.println("Напишите слово:");
            String huword = sc.nextLine();
            if (isWordinWords(huword))
            {
                System.out.println("Вы угадали слово! Игра окончена.");
                break;
            }
            promptWord(huword);
        }
    }

    public static boolean isWordinWords(String word)
    {
        if (aiword.equals(word)) return true;
          else return false;
    }

    public static void promptWord(String word)
    {
        String strPrompt = "";
        for (int i = 0; i <= word.length()-1 && i <= aiword.length()-1; i++)
        {
            if (word.charAt(i) == aiword.charAt(i)) strPrompt += aiword.charAt(i);
               else strPrompt += "#";
        }
        System.out.println(strPrompt + "###############");
    }
}
