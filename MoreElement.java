import java.util.Scanner;
import java.util.Arrays;

public class MoreElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Nhap phan tu can them :");
        int value = scanner.nextInt();
        System.out.println("Vi tri :");
        int index = scanner.nextInt();
        System.out.println(Arrays.toString(moreElement(arr,value,index)));

    }

    public static int[] moreElement(int[] array,int value,int index) {
        int n = array.length;
        int[] temp = new int[n + 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (i == index) {
                temp[k] = value;
                k++;
            }
            temp[k] = array[i];
            k++;

        }
        return temp;
    }
}
