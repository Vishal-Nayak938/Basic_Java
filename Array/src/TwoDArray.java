public class TwoDArray {
    public static void main(String args[])
    {
    int[][] arr={{12,34,56},{23,98,76}};
    displayElement(arr);
    }

    static void displayElement(int arr2[][]) {
        int i = 0, j = 0;
        while (i < arr2.length) {
            while (j < arr2.length) {
                System.out.println(arr2[i][j]);
                j++;
            }
            i++;
        }
    }

}
