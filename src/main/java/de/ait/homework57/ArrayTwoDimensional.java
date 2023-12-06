package de.ait.homework57;

import java.util.Random;

public class ArrayTwoDimensional {
    public static void main(String[] args) {
        try {
            // Создание двумерного массива 5x5
            int[][] array = new int[5][5];

            // Заполнение массива случайными числами от 1 до 100
            Random random = new Random();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    array[i][j] = random.nextInt(100) + 1;
                }
            }

            // Вывод массива на экран
            System.out.println("Исходный массив:");
            printAllArray(array);

            // Поиск максимального элемента и вывод на экран
            int maxElement = findMaxElement(array);
            System.out.println("Максимальный элемент в массиве: " + maxElement);

            // Расчет и вывод среднего значения
            double averageValue = arrayAverageValue(array);
            System.out.println("Среднее значение всех чисел в массиве: " + averageValue);

            // Вывод чисел, больших среднего значения
            System.out.println("Числа больше среднего значения:");
            printNumbersAboveAverage(array, averageValue);
        } catch (Exception e) {
            System.out.println("Произошла ошибка: " + e.getMessage());
        }
    }

    // Метод для вывода массива на экран
    static void printAllArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Метод для поиска максимального элемента в массиве
    static int findMaxElement(int[][] array) {
        int maxElement = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                }
            }
        }
        return maxElement;
    }

    // Метод для вычисления среднего значения в массиве
    static double arrayAverageValue(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        return (double) sum / count;
    }

    // Метод для вывода чисел в массиве, больших среднего значения
    static void printNumbersAboveAverage(int[][] array, double averageValue) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > averageValue) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
