package at.campus02.bsd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Calculator {

    private static Logger logger = LogManager.getLogger();

    public double add (double number1, double number2){
        logger.debug("Parameter1: " + number1 + "  Parameter2: " + number2);
        return number1 + number2;}

    public double minus (double number1, double number2){
        logger.debug("Parameter1: " + number1 + "  Parameter2: " + number2);
        return number1 - number2;}

    public double multiply (double number1, double number2){
        logger.debug("Parameter1: " + number1 + "  Parameter2: " + number2);
        return number1 * number2;}

    public double divide (double number1, double number2) {

        double result = 1;
        try {
            result = number1 / number2;
        }catch (ArithmeticException e){

        }

        if (number2 == 0){
            logger.error("Division by Zero");
            return 0;
        }

        logger.debug("Parameter1: " + number1 + "  Parameter2: " + number2);
        return number1 / number2;}

    public double fakultaet (double number){

        logger.debug("Parameter: " + number);

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
