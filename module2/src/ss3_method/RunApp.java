package ss3_method;

public class RunApp {
    public static void main(String[] args) {
        // method static được gọi thông qua class
//        DemoMethod.showMessage1();
        // method không static thì không gọi trước tiếp từ class
        DemoMethod demoMethod = new DemoMethod();
//        demoMethod.showMessage2("C10");
        demoMethod.showMessage1(); // không nên gọi thông qua đối tượng
//        int result = DemoMethod.sum(10,20);
//        System.out.println(result);
    }
}
