package at.campus02.bsd;

public class Main {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        double add = calc.add(6,8);
        double minus = calc.minus(10,5);
        double divide = calc.divide(12,6);
        double multiply = calc.multiply(2,3);
        double fak = calc.fakultaet(3);

        System.out.println(add);
        System.out.println(minus);
        System.out.println(divide);
        System.out.println(multiply);
        System.out.println(fak);


    }

}
