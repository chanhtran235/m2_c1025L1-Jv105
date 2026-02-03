package ss4_object_class.bai_tap;

public class Main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,3,1);
        if (quadraticEquation.getDiscriminant()<0){
            System.out.println("pt vô nghiêm");
        }else if (quadraticEquation.getDiscriminant()>0){
            System.out.println(" pt có 2 nghiêm");
            System.out.println("x1= "+quadraticEquation.getRoot1());
            System.out.println("x2 ="+ quadraticEquation.getRoot2());
        }else {
            System.out.println("Nghiệm kép");
            System.out.println("x1=x2= " +quadraticEquation.getRoot2());
        }
    }
}
