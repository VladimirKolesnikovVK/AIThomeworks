package de.ait.homework57;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ArrayUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayUtil.class);

    public static void main(String[] args) {
        int[][] arrayForTest = createArray(5,5);
        System.out.println(findMaxValue(arrayForTest));
    }
    public static int[][] createArray(int lineSize, int colSize){
        int [][] arrayToReturn = new int[lineSize][colSize];
        Random random = new Random();
        for (int i =0; i<arrayToReturn.length; i++){
            for (int y =0; y<arrayToReturn[i].length; y++){
                int randomInt = random.nextInt(100 +1);
                arrayToReturn[i][y] = randomInt;
                LOGGER.info("ArrayToReturn position{};{} value{}",i,y,randomInt);
            }
        }
        return arrayToReturn;
    }

    public static int findMaxValue(int[][] array){
        int maxValue =0;
        for (int i =0; i<array.length; i++){
            for (int y =0; y<array[i].length; y++){
                if (array[i][y] > maxValue){
                    maxValue = array[i][y];
                }
            }
        }
        LOGGER.info("maxValue {}",maxValue);
        return maxValue;
    }

    public double findAvarage(int[][] array){
        double sum =0;
        int count =0;
        double average =0;
        for (int i =0; i<array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                count++;
                sum = sum + array[i][y];
            }
        }
        LOGGER.info("Sum {}",sum);
        LOGGER.info("elements {}",count);
        average = sum/count;
        LOGGER.info("average:{}",average);
        return average;
    }

    public static void showElementsGraterThen(int[][] array, double number){
        for (int i =0; i<array.length; i++) {
            for (int y = 0; y < array[i].length; y++) {
                // if (array[i][y]){

                //}
            }
        }
    }
}
