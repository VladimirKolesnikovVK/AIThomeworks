package de.ait.homework34;

/*Тестирование конкатенации строк
Написать тесты для проверки конкатенации двух строк.

Тестирование вычисления длины строки
Написать тесты для проверки правильности вычисления длины строки.

Тестирование реверсии строки
Написать тесты для проверки корректности реверсии строки.

Тестирование проверки на палиндром
Написать тесты для проверки функции, определяющей, является ли строка палиндромом.

Требования:
Используйте JUnit 5 для написания тестов.
Используйте ассерт для проверки ожидаемых результатов.
Каждый тестовый метод должен быть аннотирован @Test и иметь понятное имя, отражающее тестируемый случай.
*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {
    private StringProcessor stringProcessor;
    private static final String HALLO_STRING = "Hallo ";
@BeforeEach
    public void setUp(){
        stringProcessor = new StringProcessor();
    }

    @Test
    void testConcatenateHappyPath() {
        Assertions.assertEquals("kotik",stringProcessor.reverse("kitok"));
    }

    @Test
    public void testGetLength() {

    }

    @Test
    public void testReverse() {

    }

    @Test
    public void testConcatenateSecondPalindromeNull() {

    }
}
