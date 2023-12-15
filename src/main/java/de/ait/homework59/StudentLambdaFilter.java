package de.ait.homework59;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StudentLambdaFilter {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Кирилл","Петров", 14,2.8));
        students.add(new Student("Петя","Петрушкин", 15,4.4));
        students.add(new Student("Кристина", "Косолова",14,4.5));
        students.add(new Student("Маша", "Шишкина",14,5));

        double threshold = 4.0;

        List<Student> filteredStudents = filterStudents(students, student -> student.getAverageGrade() > threshold);
        System.out.println("Студенты с средним баллом выше " + threshold + ":");

        for (Student student : filteredStudents) {
            System.out.println(student.getName() + " " + student.getLastname() + " - " + student.getAverageGrade());
        }

        // Сортировка списка студентов по фамилии
        students.sort(Comparator.comparing(Student::getLastname));

        // Вывод отсортированного списка
        System.out.println("Список студентов, отсортированный по фамилии:");
        for (Student student : students) {
            System.out.println(student.getLastname() + ", " + student.getName());
        }

        // Преобразование списка студентов в список их имен
        List<String> names = transformToNames(students, Student::getName);

        // Вывод списка имен
        System.out.println("Список имен студентов:");
        names.forEach(System.out::println);

        // Подсчет студентов с возрастом больше заданного
        int ageThreshold = 14;
        long count = countStudents(students, student -> student.getAge() > ageThreshold);

        // Вывод результата подсчета
        System.out.println("Количество студентов с возрастом больше " + ageThreshold + ": " + count);

        // Нахождение студента с максимальным средним баллом
        Optional<Student> maxGradeStudent = findMaxGradeStudent(students);

        // Вывод результата поиска
        maxGradeStudent.ifPresent(student ->
                System.out.println("Студент с максимальным средним баллом: " + student.getName() + " " + student.getLastname() + " - " + student.getAverageGrade()));

        // Нахождение студента с минимальным средним баллом
        Optional<Student> minGradeStudent = findMinGradeStudent(students);

        // Вывод результата поиска
        minGradeStudent.ifPresent(student ->
                System.out.println("Студент с минимальным средним баллом: " + student.getName() + " " + student.getLastname() + " - " + student.getAverageGrade()));
    }

    // Метод для фильтрации списка студентов с использованием лямбда-выражения
    public static List<Student> filterStudents(List<Student> students, StudentFilterCondition condition) {
        List<Student> filteredStudents = new ArrayList<>();
        for (Student student : students) {
            if (condition.test(student)) {
                filteredStudents.add(student);
            }
        }
        return filteredStudents;
    }

    // Метод для преобразования списка студентов в список их имен
    public static List<String> transformToNames(List<Student> students, StudentNameExtractor extractor) {
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(extractor.extractName(student));
        }
        return names;
    }

    // Метод для подсчета студентов с использованием лямбда-выражения
    public static long countStudents(List<Student> students, StudentFilterCondition condition) {
        return students.stream().filter(condition::test).count();
    }

    // Метод для нахождения студента с максимальным средним баллом
    public static Optional<Student> findMaxGradeStudent(List<Student> students) {
        return students.stream().max(Comparator.comparing(Student::getAverageGrade));
    }

    // Метод для нахождения студента с минимальным средним баллом
    public static Optional<Student> findMinGradeStudent(List<Student> students) {
        return students.stream().min(Comparator.comparing(Student::getAverageGrade));
    }

    // Интерфейс для условия фильтрации студентов
    interface StudentFilterCondition {
        boolean test(Student student);
    }

    // Интерфейс для извлечения имени студента
     interface StudentNameExtractor {
        String extractName(Student student);
    }

}

