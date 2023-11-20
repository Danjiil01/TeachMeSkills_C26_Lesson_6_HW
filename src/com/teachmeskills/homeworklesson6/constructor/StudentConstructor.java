package com.teachmeskills.homeworklesson6.constructor;

public class StudentConstructor {
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String groupName;

    // Конструктор без параметров
    public StudentConstructor() {
    }

    // Конструктор с параметрами
    public StudentConstructor(String firstName, String lastName, String passportNumber, String groupName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportNumber = passportNumber;
        this.groupName = groupName;
    }

    // Геттеры и сеттеры для всех полей

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
