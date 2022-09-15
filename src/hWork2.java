import java.util.Scanner;
import java.util.Arrays;

public class hWork2 {
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr1 = fillArr();
        int[] arr2 = fillArr();
        System.out.println(Arrays.toString(mergeArr(arr1, arr2)));
    }
    static int[] fillArr () {
        int[] arr = {};
        String input;
        for (int i = 0; true; i++) {
            input = scan.nextLine();
            if (!input.matches("[0-9]+")) {
            }
            arr = Arrays.copyOf(arr, i + 1);
            arr[i] = Integer.parseInt(input);
        }
    }
    static int[] mergeArr (int[] arr1, int[] arr2) {
        int[] mergedArr = new int[arr1.length + arr2.length];
        for (int i = 0; i < mergedArr.length; i++) {
            if (i < arr1.length)
                mergedArr[i] = arr1[i];
            else
                mergedArr[i] = arr2[i - arr1.length];
        }
        return mergedArr;
    }
}
