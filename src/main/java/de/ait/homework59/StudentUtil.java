package de.ait.homework59;

import java.util.Arrays;
import java.util.List;

public class StudentUtil {
   private static Student studentAdolf = new Student("adolf","hitler",50,1.5);
   private static Student studentRobin = new Student("robin","hill",35,1.1);
   private static Student studentrTerminator = new Student("arnold","r-1000",15,1.2);
   private static List<Student> studentList;

    public static void main(String[] args) {
        studentList = Arrays.asList(studentAdolf,studentRobin,studentrTerminator);

        studentList.sort((studentOne, studentTwo) -> studentOne.getLastname().compareTo(studentTwo.getLastname()));

        //Student bestStudent = studentList.stream().reduce((studentOne, studentTwo) -> studentOne.getAverageGrade() < studentTwo.averageGrade ? studentOne::s)

        double averageGradeToCheck =1.2;

        studentList.stream().filter(student -> student.getAverageGrade() >=averageGradeToCheck).toList().forEach(System.out::println);

        List<String> result = studentList.stream().map(Student::getName).toList();
        System.out.println(result);

        int ageToCheck = 20;

        long contResult = studentList.stream().filter(student -> student.getAge() > ageToCheck).count();
        System.out.println(contResult);


    }
}
