package de.ait.homework58;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaToWork {
    public static void main(String[] args) {
        //Фильтрация списка
        List<String> lambdas = Arrays.asList("lambda","ambda","mbda","bda","da","a"," ");
        String foundLambda = lambdas.stream().filter(lambda -> lambda.startsWith("a") && lambda.length()>0).findFirst().orElse("not found");
        System.out.println(foundLambda);

        System.out.println("-------------------------");

        //Преобразование элементов списка
        List<Integer> intNumbers = Arrays.asList(2,3,4,55);
        List<Integer> result=  intNumbers.stream().map(nuber -> nuber*nuber).toList();
        result.forEach(System.out::println);
        /*intNumbers.replaceAll(element-> element*element);
        List<Integer> squareNumbers = intNumbers;
        System.out.println(squareNumbers);*/

        System.out.println("-------------------------");

        //Лямбда-выражение для работы с потоком данных
        List<Integer> evenNumbers = Arrays.asList(2,3,4,6,8,1,23,22,31,32);
        evenNumbers.stream().filter(element-> element%2==0).forEach(System.out::println);

        System.out.println("-------------------------");

        //Использование forEach с лямбда-выражениями
        List<Integer> forEachNumbers = Arrays.asList(2,3,4,6,8,1,23,22,31,32);
        forEachNumbers.forEach(number -> System.out.println(number));

        System.out.println("-------------------------");

        //Работа с потоками (Streams)
        List<String> words = Arrays.asList("bmw","porsche","mercedes","audi");
        List<String> newWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        newWords.forEach(System.out::println);
    }
}
