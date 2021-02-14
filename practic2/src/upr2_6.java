public class upr2_6
{
    public static int positionBalance = -1;

    public static void main(String[] args) {
        int arr[] = new int[] {2, 4, 1, 5, 8, 3, 1};   // {2, 2, 2, 1, 2, 2, 10, 1};
        boolean balance = isCheckBalance(arr);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
            if (balance && i == positionBalance) System.out.print(" || ");
        }
        System.out.println(" --> " + balance);
    }

    public static boolean isCheckBalance(int[] a)
    {
        int summLeft = a[0];
        int summRight = 0 ;

        for (int i = 1; i < a.length; i++) { summRight += a[i]; }

        for (int i = 1; i < a.length; i++)
        {
            if (summLeft == summRight)
            {
                positionBalance = i-1;
                break;
            }
            summLeft += a[i];
            summRight -= a[i];
        }
        if (positionBalance >= 0) return true;
            else return false;
    }
}
