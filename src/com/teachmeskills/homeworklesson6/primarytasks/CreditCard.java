package com.teachmeskills.homeworklesson6.primarytasks;

import com.teachmeskills.homeworklesson6.constructor.CreditCardConstructor;

public class CreditCard {
    public static void main(String[] args) {
        CreditCardConstructor card1 = new CreditCardConstructor(111111, 1000.0);
        CreditCardConstructor card2 = new CreditCardConstructor(222222, 2000.0);
        CreditCardConstructor card3 = new CreditCardConstructor(333333, 3000.0);

        card1.deposit(500.0);
        card2.deposit(1000.0);

        card3.withdraw(1500.0);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
