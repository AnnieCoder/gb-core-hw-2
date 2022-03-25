package ru.gb.java_core2;

public class HomeWorkApp {

    public static void main(String[] args) {

        System.out.println(checkSum(55, 10));
        printNumber(-34);
        System.out.println(positiveNumber(55));
        printText("Java junior", 7);
        System.out.println(isLeapYear(2010));
    }

    public static boolean checkSum(int a, int b) {
        return (a + b >= 10 && a + b <= 20) ? true : false;
    }

    public static void printNumber(int number) {
        if (positiveNumber(number)) {
            System.out.printf("%d - положительное число\n", number);
        } else {
            System.out.printf("%d - отрицательное число\n", number);
        }

    }

    public static boolean positiveNumber(int number) {
        return number >= 0 ? true : false;
    }

    public static void printText(String someText, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(someText);
        }

    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
