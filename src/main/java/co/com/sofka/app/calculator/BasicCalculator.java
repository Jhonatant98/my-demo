package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long subtrac(Long number1, Long number2) {
        logger.info( "Summing {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long mult(Long number1, Long number2) {
        logger.info( "Summing {} * {}", number1, number2 );
        return number1 * number2;
    }
    public Float div(Long number1, Long number2) {
        Float result = 0f;
        try {
            result = Float.valueOf(number1/number2);
        }catch (ArithmeticException a){
            logger.info("la división por cero es indeterminado "+a);
        }
        return result;
    }
}
