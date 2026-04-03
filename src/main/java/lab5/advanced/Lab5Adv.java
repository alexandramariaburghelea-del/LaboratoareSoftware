package lab5.advanced;

public class Lab5Adv {
    static void main(String[] args) {
        NewIntCalculator c=new NewIntCalculator();
        c.init(10);
        System.out.println((Integer)c.add(5).subtract(3).multibply(2).result());
        DoubleCalculator d=new DoubleCalculator();
        d.init(10.0);
        System.out.println((Double)d.add(5.0).subtract(3.3).multiply(2.2).result());

    }
}
