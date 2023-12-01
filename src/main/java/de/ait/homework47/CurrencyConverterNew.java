package de.ait.homework47;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class CurrencyConverterNew {
   /* private static final Logger LOGGER = LoggerFactory.getLogger(CurrencyConverter.class);
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("");
        String amount = scanner.nextLine();
    }
    private static double converCaurrency(String amount, String targetCurrency, String currency){
        boolean checkAmount = false;
        boolean checkTargetCurrency = false;
        boolean checkCurrency = false;
        double convertResult;
        double amountDouble = 0;
        String messageWrongCurrency = "oshibka: nesushestvuushii";
        while (!checkAmount){
            try {
                 amountDouble = Double.parseDouble(amount);
                 checkAmount = true;
                 LOGGER.info("amount to convert {}", amountDouble);
            }
            catch (NumberFormatException exception){
                System.out.println("oshibka: vvedeno ne chislo");
                LOGGER.error("wrong anount format: {}", amount, exception);
                System.out.println("vvedite summu dla konvertazii:");
                amount = scanner.nextLine();
            }
        }
        while (!checkTargetCurrency){
            try {
                if (!targetCurrency.equals("usd") && !targetCurrency.equals("eur")){
                    throw new IllegalArgumentException("wrong currency to convert");
                }else {
                    checkAmount = true;
                }
            }
            catch (IllegalArgumentException exception){
                System.out.println(messageWrongCurrency);
            }
        }
        while (!checkCurrency){
            try {
                if (!currency.equals("usd") && !currency.equals("eur")){
                    throw new IllegalArgumentException("wrong currency to convert" + currency);
                }
            }
            catch (IllegalArgumentException exception){
                System.out.println(messageWrongCurrency);
            }
        }
        return 0;
    }*/

}
