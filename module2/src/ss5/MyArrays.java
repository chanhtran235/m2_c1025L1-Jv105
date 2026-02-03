package ss5;

public class MyArrays {

    // tạo một phương thức tìm tất cả các số nguyên tố có trong mảng.
    public static void findPrimeInArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])){
                System.out.println(array[i]);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
