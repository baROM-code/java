public class upr2_7 {

    public static void main(String[] args)
    {
        int arr[] = new int[] { 1, 5, 3, 2, 11, 4, 54, 4, 8, 9, -10 };
        int stepOffsetArray  = 2;


           for (int i = 0; i < Math.abs(stepOffsetArray); i++)
           {
               if (stepOffsetArray > 0) offsetArrayRightOne(arr);
               if (stepOffsetArray < 0) offsetArrayLeftOne(arr);
           }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static void offsetArrayRightOne(int[] a)
    {
        // смещение элементов массива на +1 вправо
        int t = a[a.length-1];
        for (int i = a.length-1 ;i > 0 ;i--)
        {
          a[i] = a[i - 1];
        }
        a[0] = t;
    }

    public static void offsetArrayLeftOne(int[] a)
    {
        // смещение элементов массива на +1 влево
        int t = a[0];
        // a[0] = a[a.length - 1];
        for (int i = 0; i < a.length-1 ;i++)
        {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = t;
    }
}
