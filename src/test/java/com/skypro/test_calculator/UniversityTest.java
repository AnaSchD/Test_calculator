package com.skypro.test_calculator;

import com.skypro.test_calculator.primer.Student;
import com.skypro.test_calculator.primer.University;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UniversityTest {

    private Student student1;
    private Student student2;
    private Student student3;
    private University university;

    @BeforeEach  //чтобы не писать много тестов и одну и ту же инфу можно сделать метод с аннотацией бефорич, чтобы перед запуском тестов запускался сначала он
    public void setUp() {
        student1 = new Student("Zhenya", 35, true); //создаем трех студентов
        student2 = new Student("Masha", 25, false);
        student3 = new Student("Alina", 23, false);

        university = new University(); //создаем экземпляр класса и добавим студентов в университет

        university.addStudent(student1);
        university.addStudent(student2);
        university.addStudent(student3);

    }


    @Test
    public void getAllStudents() //тестируем метод в классе University с таким же названием
    {
        List<Student> expected = university.getAllStudents(); // создаем переменную expected типа Лист, в которую поместим результат вызова функции getAllStudents

        List<Student> actual = new ArrayList<Student>(); //создаем переменную actual, в которую поместим студентов, которых зачислили в университет

        actual.add(student1);
        actual.add(student2);
        actual.add(student3);

        assertEquals(expected, actual); // статичесий метод класса Assert, который принимает два параметра и выдает ошибку сравнения,
                                        // а именно ошибку throw new AssertionError, если значения не эквивалентны. Иначе тест без ошибок проходит дальше

    }

    @Test
    public void getAllStudentsNotNull() //проверить метод, на null, переменная в классе Университи должна быть проинициализированна, иначе будет ошибка
    {
        University university = new University();
        List<Student> expected = university.getAllStudents();

        assertNotNull(expected);
    }

    @Test
    public void getAllStudentsIsMale() //тестируем метод в классе University с таким же названием на половой признак
    {

        List<Student> expected = university.getAllStudents(true); // создаем переменную expected типа Лист, в которую поместим результат вызова функции getAllStudents

        List<Student> actual = new ArrayList<Student>(); //создаем переменную actual, в которую поместим студентов, которых зачислили в университет

        actual.add(student1);

        assertEquals(expected, actual); // статический метод класса Assert, который принимает два параметра и выдает ошибку сравнения,
        // а именно ошибку throw new AssertionError, если значения не эквивалентны. Иначе тест без ошибок проходит дальше

    }
}
