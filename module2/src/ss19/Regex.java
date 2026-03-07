package ss19;

import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {
        String string = "hello          codegym viet               name";
        String[] array = string.split("\\s+");
        System.out.println(Arrays.toString(array));
        // validate email:
        // + phải chứa ký tự đầu tiên là chữ
        // + không chua ký tự đặc biệt
        // đội dài tối thiểu là 6
        // phải có 1 @ ở giữa
        // phải có xxxxxxxxx@yyyy.zzzz
    }
}
