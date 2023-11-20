package com.teachmeskills.homeworklesson6.primarytasks;

import com.teachmeskills.homeworklesson6.constructor.StudentConstructor;

public class Student {
    public static void main(String[] args) {
        // Создание объектов класса StudentConstructor для каждого студента группы
        StudentConstructor student1 = new StudentConstructor("John", "Green", "ER12345", "Group A");
        StudentConstructor student2 = new StudentConstructor("Peter", "Griffin", "MP54321", "Group A");
        StudentConstructor student3 = new StudentConstructor("Anna", "Brown", "PS98765", "Group B");

        // Создание массива и добавление всех студентов
        StudentConstructor[] students = {student1, student2, student3};

        // Вывод информации о каждом студенте
        for (StudentConstructor student : students) {
            System.out.println("Name: " + student.getFirstName());
            System.out.println("Last name: " + student.getLastName());
            System.out.println("Passport number: " + student.getPassportNumber());
            System.out.println("Group name: " + student.getGroupName());
            System.out.println();
        }
    }
}
