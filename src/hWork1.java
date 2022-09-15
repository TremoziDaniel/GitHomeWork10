import java.util.Scanner;
import java.util.Arrays;

public class hWork1 {
    static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = fillArr();
        int numInArr = scan.nextInt();
        System.out.println(Arrays.toString(allMatches(arr, numInArr)));
    }
    static int[] fillArr () {
        int[] arr = {};
        String input;
        for (int i = 0; true; i++) {
            input = scan.nextLine();
            if (!input.matches("[0-9]+")) { //теперь будет принимать только целые числа и не будет ошибки
                return arr;
            }
            arr = Arrays.copyOf(arr, i + 1);
            arr[i] = Integer.parseInt(input);
        }
    }
    static int[] allMatches (int[] arr, int numInArr) {
        int[] numInArrIndex = {-1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numInArr) {
                numInArrIndex = Arrays.copyOf(numInArrIndex, j + 1);
                numInArrIndex[j] = i;
                j++;
            }
        }
        return numInArrIndex;
    }
}