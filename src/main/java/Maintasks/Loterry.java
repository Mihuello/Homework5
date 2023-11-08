package Maintasks;

import java.util.*;

public class Loterry {

    static int[] arrayCreate() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int randoms = random.nextInt(100);
            int temp = array[randoms];
            array[randoms] = array[i];
            array[i] = temp;
        }
        return array;
    }

    static int[] printArray(int [] array) {
        for (int i = 0; i < 10; i++) {

            System.out.println(array[i] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = printArray(arrayCreate());
    }
}





