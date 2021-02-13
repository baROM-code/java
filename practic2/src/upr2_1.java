public class upr2_1 {

    public static void main(String[] args)
    {
        byte arr[] = new byte[] { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        for (int i = 0; i < 10; i++)
        {
            if (arr[i] == 0)  arr[i] = 1;
                else arr[i] = 0;
            System.out.print(arr[i]);
        }
    }
}
