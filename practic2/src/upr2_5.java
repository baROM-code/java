public class upr2_5 {

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 5, 3, 2, 11, 4, 54, 4, 8, 9, -10 };

        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)  min = arr[i];
            if (arr[i] > max)  max = arr[i];
        }
        System.out.println("Минимальное значение массива = " + min);
        System.out.println("Максимальное значение массива = " + max);
    }

}
