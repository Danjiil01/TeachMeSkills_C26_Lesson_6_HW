package com.teachmeskills.homeworklesson6.constructor;

public class CreditCardConstructor {
    private int accountNumber;
    private double balance;

    // Конструктор с двумя параметрами
    public CreditCardConstructor(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для начисления суммы на кредитную карточку
    // Принимает сумму и добавляет ее к текущей
    public void deposit(double amount) {
        balance += amount;
    }

    // Метод для снятия суммы с карточки
    // Принимает сумму и отнимает ее от текущей
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Метод для вывода информации о карточке
    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Current balance: " + balance);
    }
}
