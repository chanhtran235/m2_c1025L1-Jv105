package ss3_method;

import java.util.Arrays;

public class DemoThamTriThamChieu {
    public static void main(String[] args) {
//        int y =10;
//        changeValue(y);
//        System.out.println(y);

        int[] array = {1,2};
        changeArray(array);
        System.out.println(" Ngoài method :" + Arrays.toString(array));
    }

    public static void changeArray(int[] arr){
//        arr[0] = 100;
        arr = new int[]{100,200};
        System.out.println("trong method :" + Arrays.toString(arr));
    }


    public static void changeValue(int x){
        x ++;
        System.out.println("trong method :"+ x);
    }


}
