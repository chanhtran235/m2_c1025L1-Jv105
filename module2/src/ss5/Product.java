package ss5;

import java.util.UUID;

public class Product {
    // yêu cầu là đủ ký tự => X là các so
    private  String code;
    private String name;
    protected float price;

    public Product() {
    }

    public Product(String name, float price) {
//        if (code.length()==5){
//            this.code = code;
//        }else {
//            System.out.println("code phải đúng 5 ký tự");
//        }
        this.code = UUID.randomUUID().toString();
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

//    public void setCode(String code) {
//        if (code.length()==5){
//            this.code = code;
//        }else {
//            System.out.println("code phải đúng 5 ký tự");
//        }
//
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    public void method2(){
        method1();
    }
    // tạo ra để chỉ sử dụng trong class Product này.
    private void  method1(){
        System.out.println("tính toán gì đó");
    }

    @Override
    public String toString() {
        return "Product{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
