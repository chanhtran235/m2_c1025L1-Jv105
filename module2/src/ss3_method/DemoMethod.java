package ss3_method;

public class DemoMethod {
    // method main là nơi chạy chương đâu tiên
//    public static void main(String[] args) {
//        showMessage1();
//        DemoMethod demoMethod = new DemoMethod();
//        demoMethod.showMessage2("C10");
//    }
   public static void showMessage1(){
        System.out.println("Hello codegym");
    }
    public void showMessage2(String mess){
        System.out.println("Hello "+ mess);
    }

    public static int sum(int a, int b){
        return a+b;
    }

    public static String concateString(String str1, String str2){
       return "Kết quả của chuỗi " + str1+str2;

    }




}
