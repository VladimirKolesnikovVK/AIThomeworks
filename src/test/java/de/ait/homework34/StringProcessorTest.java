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

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StringProcessorTest {
    private StringProcessor stringProcessor = new StringProcessor();

    @Test
    public void testConcatenate() {
        String result = stringProcessor.concatenate("Cohort33", "super");
        assertEquals("Cohort33super", result);
    }

    @Test
    public void testGetLength() {
        int length = stringProcessor.getLength("Cohort33");
        assertEquals(8, length);
    }

    @Test
    public void testReverse() {
        String result = stringProcessor.reverse("Cohort33");
        assertEquals("33trohoC", result);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(stringProcessor.isPalindrome("Ein Esel lese nie"));
        assertFalse(stringProcessor.isPalindrome("Cohort33"));
    }
}
