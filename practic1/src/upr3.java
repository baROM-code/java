public class upr3 {

    public static void main(String[] args)
    {
        float a = 2.3f;
        float b = 5.6f;
        float c = 7.2f;
        float d = 8.9f;

        System.out.println(testCalculation(a, b, c, d));

    }

    public static float testCalculation (float a, float b, float c, float d )
    {
        return a * (b + (c / d));
    }

}

