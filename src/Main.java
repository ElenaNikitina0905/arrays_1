import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    // 1
        int [] array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;

        double[] doubleArr = {1.57, 7.654, 9.986};

        char[] chars = {'U', 'n', 'i', 'v', 'e', 'r', 's', 'e'};

    // 2
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(Arrays.toString(chars));

    // 3
        for (int i = array1.length - 1; i >= 0; i--) {
            if (i < 1) {
                System.out.println(array1[i]);
                break;
            }
            System.out.print(array1[i]  + ", ");
        }

       for (int i = doubleArr.length - 1; i >= 0; i--) {
            if (i < 1) {
                System.out.println(doubleArr[i]);
                break;
            }
            System.out.print(doubleArr[i]  + ", ");
        }

        for (int i = chars.length - 1; i >= 0; i--) {
            if (i < 1) {
                System.out.println(chars[i]);
                break;
            }
            System.out.print(chars[i]  + ", ");
        }

        for (int i = 0; i < array1.length; i++) {
            if (i % 2 == 0) {
                array1 [i] = array1 [i] + 1;}}
            System.out.println(Arrays.toString(array1));
    }}