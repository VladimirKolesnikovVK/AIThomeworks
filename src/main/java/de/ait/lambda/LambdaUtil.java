package de.ait.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaUtil {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("javaScript");
        list.forEach(element -> System.out.println(element));

        List<Integer> numbers = Arrays.asList(4,12,54,9,7,22,9,3,5);
        List<Integer> numbersSelected = numbers.stream().filter(number -> number > 10).collect(Collectors.toList());
        List<Integer> numbersSelectedNew = numbers.stream().filter(number -> number > 10).toList();
        System.out.println(numbersSelected);
        System.out.println(numbersSelectedNew);

        List<Integer> integerList = Arrays.asList(4,5,6,78,0,8,65);
        int sum = integerList.stream().reduce(0,(a,b)-> a+b);
        System.out.println("sum:" + sum);

        List<String> stringList = Arrays.asList("hallo","java","deutchland");
        List<Integer> wordsLength = stringList.stream().map(String::length).toList();
        System.out.println(wordsLength);

        List<String> listWords = new ArrayList<>();
        listWords.add("hallo");
        listWords.add("java");
        listWords.add("hello");
        listWords.add("python");
        boolean result = listWords.removeIf(word -> word.startsWith("ja"));
        System.out.println(result);
        System.out.println(listWords);

        List<Integer> integerListNumbers = Arrays.asList(4,5,6,78,0,8,65);
        int maxNumber = Collections.max(integerListNumbers, Integer::compare);
        int minNumber = Collections.min(integerListNumbers, Integer::compare);
        System.out.println("maxNumber: " + maxNumber);
        System.out.println("minNumber: " + minNumber);

        integerListNumbers.replaceAll(element-> element *2);
        System.out.println(integerListNumbers);

        List<String> cities = Arrays.asList("new yours", "chicago", "berlin");
        String foundCity = cities.stream().filter(city-> city.startsWith("c") && city.length()>3).findFirst().orElse("not found");
        System.out.println(foundCity);
    }
}