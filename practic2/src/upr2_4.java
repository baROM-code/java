public class upr2_4 {

    public static void main(String[] args) {
        int dim = 12;
        int arr[][] = new int[dim][dim];

        for (int i = 0; i < dim; i++) {
            arr[i][i] = 1;
            arr[dim-i-1][i] =1;
        }
     /*   for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        } */
    }
}
