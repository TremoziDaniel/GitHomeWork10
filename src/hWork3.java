import java.util.Scanner;
import java.util.Arrays;

public class hWork3 {
    final static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[][][]arr = {{{12, 14},{51, 26}},{{0},{2}},{{1240},{987}}};
        System.out.println(Arrays.deepToString((arr)));
        System.out.println(Arrays.deepToString(increaseSize(arr)));
    }
    static int[][][] increaseSize(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == arr.length - 1 && j == arr[i].length - 1) {
                    arr[i][j] = Arrays.copyOf(arr[i][j], arr[i][j].length + 1);
                    arr[i][j][arr[i][j].length-1] = scan.nextInt();
                }
            }
        }
        return arr;
    }
}