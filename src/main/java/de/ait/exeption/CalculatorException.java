package de.ait.exeption;

import de.ait.homework47.CurrencyConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalculatorException {
    private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverter.class);

    public int divide(int numberOne, int numberTwo){
        try {
            return numberOne/numberTwo;
        }
        catch (ArithmeticException exception){
            LOGGER.error("devide by 0",exception.getMessage());
            return 0;
        }
    }
}
