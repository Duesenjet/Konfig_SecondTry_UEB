package at.campus02.bsd;

public class Calculator {

    public double add (double number1, double number2){return number1 + number2;}

    public double minus (double number1, double number2){return number1 - number2;}

    public double multiply (double number1, double number2){return number1 * number2;}

    public double divide (double number1, double number2) {return number1 / number2;}

    public double fakultaet (double number){

        if (number <= 0) {
            return 0;
        }
        else{
            double result = 1;

            for (double i = number; i > 0; i--){
                result *= i;
            }
            return result;
        }



    }


}
