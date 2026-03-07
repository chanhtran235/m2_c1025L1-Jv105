package ss19;

public class Demo {
    public static void main(String[] args) {
        // cách 1: string literal : khai báo trực tiếp
        String str1 = "hello"; // => giống kiểu nguyên thuỷ
        // sử dụng lớp String.

//
//        String str3 = "hello";
//        String str4 = str1;
//        String str5 = new String ("hello");
//        String str6 = str2;

//        System.out.println(str1==str2); //false
//        System.out.println(str1==str3); // true
//        System.out.println(str2==str5); // false
//        System.out.println(str2==str6); // true
//
//        System.out.println(str1.equals(str2));// true
//        System.out.println(str2.equals(str5));// true
        // string là bất biến
        String str2 = new String("hello");
        String str3 = str2;
        str2 += "codegym";
        System.out.println(str2);
        System.out.println(str3);

        StringBuffer  stringBuffer1 = new StringBuffer("hello");
        StringBuffer stringBuffer2 = stringBuffer1;
        stringBuffer1.append("codegym"); // hello codegym
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer2);


       //  khi so sánh bằng có 2 cách
        // sử dấu ==;
         // + kiểu nguyên thuỷ => so sánh giá tị
         // + đối tượng; => so sánh địa chỉ ô nhớ

        // sử dụng phương thức .equals.
        // + đối tượng: equals của Object (vẫn là ss ==)
        // => String là con Object và java đã nghi đè lại => so sanh giá trị
    }
}
